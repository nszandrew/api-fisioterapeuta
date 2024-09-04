package br.com.nelmara.physiotherapist.usecases;

import br.com.nelmara.physiotherapist.adapters.repositories.PatientRepository;
import br.com.nelmara.physiotherapist.adapters.service.MapperModel;
import br.com.nelmara.physiotherapist.adapters.service.PatientService;
import br.com.nelmara.physiotherapist.domain.entities.patient.Patient;
import br.com.nelmara.physiotherapist.domain.entities.patient.dto.GetPatientDTO;
import br.com.nelmara.physiotherapist.domain.entities.patient.dto.PatientDTO;
import br.com.nelmara.physiotherapist.domain.entities.patient.dto.UpdatePatientDTO;
import br.com.nelmara.physiotherapist.framework.exceptions.custom.PatientNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public Page<GetPatientDTO> findAll(Pageable pageable) {
        logger.info("Finding all patients");
        var result = repository.findAll(pageable);
        return result.map(p -> MapperModel.parseObject(p, GetPatientDTO.class));
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
