package br.com.nelmara.physiotherapist.infra.usecases;

import br.com.nelmara.physiotherapist.adapters.repositories.PatientRepository;
import br.com.nelmara.physiotherapist.adapters.services.CacheService;
import br.com.nelmara.physiotherapist.adapters.services.MapperModel;
import br.com.nelmara.physiotherapist.adapters.services.PatientService;
import br.com.nelmara.physiotherapist.domain.patient.Patient;
import br.com.nelmara.physiotherapist.domain.patient.dto.GetPatientDTO;
import br.com.nelmara.physiotherapist.domain.patient.dto.PatientDTO;
import br.com.nelmara.physiotherapist.domain.patient.dto.UpdatePatientDTO;
import br.com.nelmara.physiotherapist.domain.treatment.history.dto.GetTreatmentHistoryDTO;
import br.com.nelmara.physiotherapist.exceptions.custom.PatientNotFoundException;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatientServiceImpl implements PatientService {

    private final PatientRepository repository;
    private final CacheService cacheService;
    private final Logger logger = LoggerFactory.getLogger(PatientServiceImpl.class);

    public PatientServiceImpl(PatientRepository repository, CacheService cacheService) {
        this.repository = repository;
        this.cacheService = cacheService;
    }

    @Override
    public void addPatient(PatientDTO data) {
        logger.info("Adding patient {} {}", data.firstName(), data.lastName());
        Patient patient = new Patient();
        BeanUtils.copyProperties(data, patient);
        repository.save(patient);
        cacheService.evictAllCacheValues("Patient");
        logger.info("Cache empty");
    }

    @Override
    @Cacheable("Patient")
    public Page<GetPatientDTO> findAll(Pageable pageable) {
        logger.info("Finding all patients with treatment histories and apply in memory");

        List<Patient> patients = repository.findAllWithTreatments(pageable);

        ModelMapper modelMapper = new ModelMapper();

        TypeMap<Patient, GetPatientDTO> typeMap = modelMapper.createTypeMap(Patient.class, GetPatientDTO.class);
        typeMap.addMappings(mapper -> {
            mapper.<List<GetTreatmentHistoryDTO>>map(src -> {
                if (src.getTreatmentHistories() == null) {
                    return new ArrayList<>(); // Se estiver null, retorna uma lista vazia
                } else {
                    return new ArrayList<>(src.getTreatmentHistories()); // Converte PersistentBag em ArrayList
                }
            }, GetPatientDTO::setTreatmentHistories);
        });

        List<GetPatientDTO> patientDTOs = patients.stream()
                .map(patient -> modelMapper.map(patient, GetPatientDTO.class))
                .collect(Collectors.toList());

        return new PageImpl<>(patientDTOs, pageable, patients.size());
    }

    //Não está funcionando - retorna erro de persistentBag, precisa converter para uma arraylist como em cima
    @Override
    public List<GetPatientDTO> findByFirstName(String firstName, String lastName) {
        logger.info("Finding patient by Full Name {} {}", firstName, lastName);
        var findingByFirstName = repository.findByFirstNameContainingIgnoreCase(firstName, lastName);

        if (findingByFirstName == null) throw new PatientNotFoundException("Patient with this name not exists: " + firstName);

        return MapperModel.parseListObjects(findingByFirstName, GetPatientDTO.class);
    }

    @Override
    public UpdatePatientDTO updatePatient(UpdatePatientDTO patientDTO, Long id) {
        logger.info("Updating a patient {} {}", patientDTO.firstName(), patientDTO.lastName());
        cacheService.evictAllCacheValues("Patient");
        logger.info("Cache empty because patient has been updated");
        var patient = repository.findById(id).orElseThrow(() -> new PatientNotFoundException("Patient with this id not exists ID: " + id));
        patient.updatePatient(patientDTO);
        repository.save(patient);
        return patientDTO;
    }

    @Override
    public void delete(Long id) {
        logger.info("deleting a patient and all treatments, by id: {}", id);
        if (!(repository.existsById(id))) {throw new PatientNotFoundException("Patient not found, nothing was deleted");}
        repository.deleteById(id);
    }
}