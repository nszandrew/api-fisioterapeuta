package br.com.nelmara.physiotherapist.usecases;

import br.com.nelmara.physiotherapist.adapters.repositories.PatientRepository;
import br.com.nelmara.physiotherapist.adapters.service.MapperModel;
import br.com.nelmara.physiotherapist.adapters.service.PatientService;
import br.com.nelmara.physiotherapist.domain.entities.patient.Patient;
import br.com.nelmara.physiotherapist.domain.entities.patient.dto.GetPatientDTO;
import br.com.nelmara.physiotherapist.domain.entities.patient.dto.PatientDTO;
import br.com.nelmara.physiotherapist.domain.entities.patient.dto.UpdatePatientDTO;
import br.com.nelmara.physiotherapist.domain.entities.treatment.history.dto.GetTreatmentHistoryDTO;
import br.com.nelmara.physiotherapist.framework.exceptions.custom.PatientNotFoundException;
import org.hibernate.Hibernate;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
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
    private final Logger logger = LoggerFactory.getLogger(PatientServiceImpl.class);

    public PatientServiceImpl(PatientRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addPatient(PatientDTO data) {
        logger.info("Adding patient {} {}", data.firstName(), data.lastName());
        Patient patient = new Patient();
        BeanUtils.copyProperties(data, patient);
        repository.save(patient);
    }

//    @Override
//    public Page<GetPatientDTO> findAll(Pageable pageable) {
//        logger.info("Finding all patients");
//        var result = repository.findAll(pageable);
//        return result.map(p -> MapperModel.parseObject(p, GetPatientDTO.class));
//    }
@Override
public Page<GetPatientDTO> findAll(Pageable pageable) {
    logger.info("Finding all patients with treatment histories");

    // Chama o método que usa o JOIN FETCH para carregar os tratamentos
    List<Patient> patients = repository.findAllWithTreatments(pageable);

    ModelMapper modelMapper = new ModelMapper();

    // Cria o TypeMap com as configurações personalizadas para o ModelMapper
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

    // Faz o mapeamento usando o modelMapper configurado
    List<GetPatientDTO> patientDTOs = patients.stream()
            .map(patient -> modelMapper.map(patient, GetPatientDTO.class))
            .collect(Collectors.toList());

    // Retorna os dados mapeados paginados
    return new PageImpl<>(patientDTOs, pageable, patients.size());
}




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
        var patient = repository.findById(id).orElseThrow(() -> new PatientNotFoundException("Patient with this id not exists ID: " + id));
        patient.updatePatient(patientDTO);
        repository.save(patient);
        return patientDTO;
    }
}
