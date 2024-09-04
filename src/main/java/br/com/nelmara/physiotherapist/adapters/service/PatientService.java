package br.com.nelmara.physiotherapist.adapters.service;

import br.com.nelmara.physiotherapist.domain.entities.patient.dto.GetPatientDTO;
import br.com.nelmara.physiotherapist.domain.entities.patient.dto.PatientDTO;
import br.com.nelmara.physiotherapist.domain.entities.patient.dto.UpdatePatientDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PatientService {

    void addPatient(PatientDTO patient);
    Page<GetPatientDTO> findAll(Pageable pageable);
    List<GetPatientDTO> findByFirstName(String firstName, String lastName);
    UpdatePatientDTO updatePatient(UpdatePatientDTO patientDTO, Long id);

}
