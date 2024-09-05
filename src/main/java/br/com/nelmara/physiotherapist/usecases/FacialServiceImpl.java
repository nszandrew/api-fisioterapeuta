package br.com.nelmara.physiotherapist.usecases;

import br.com.nelmara.physiotherapist.adapters.repositories.FacialRepository;
import br.com.nelmara.physiotherapist.adapters.repositories.PatientRepository;
import br.com.nelmara.physiotherapist.adapters.service.FacialService;
import br.com.nelmara.physiotherapist.domain.entities.treatment.types.facial.FacialTreatment;
import br.com.nelmara.physiotherapist.domain.entities.treatment.types.facial.dto.FacialTreatmentDTO;
import br.com.nelmara.physiotherapist.domain.entities.treatment.types.neurologica.NeurologicaTreatment;
import br.com.nelmara.physiotherapist.framework.exceptions.custom.PatientNotFoundException;
import br.com.nelmara.physiotherapist.framework.utils.TreatmentHistoryMethods;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class FacialServiceImpl implements FacialService {

    private final FacialRepository repository;
    private final PatientRepository patientRepository;
    private final TreatmentHistoryMethods treatmentHistoryMethods;
    private final Logger logger = LoggerFactory.getLogger(FacialServiceImpl.class);

    public FacialServiceImpl(FacialRepository repository, PatientRepository patientRepository, TreatmentHistoryMethods treatmentHistoryMethods) {
        this.repository = repository;
        this.patientRepository = patientRepository;
        this.treatmentHistoryMethods = treatmentHistoryMethods;
    }


    @Override
    public FacialTreatmentDTO addFacialTreatment(FacialTreatmentDTO data, Long id) {
        logger.info("Adding facial treatment in a patient");
        var patient = patientRepository.findById(id).orElseThrow(() -> new PatientNotFoundException("Patient not found"));

        FacialTreatment newTreatment = new FacialTreatment();
        BeanUtils.copyProperties(data, newTreatment);
        repository.save(newTreatment);

        var treatment = repository.findById(newTreatment.getId()).get();

        treatmentHistoryMethods.groupTreatmentToPatientFacial(patient, treatment);

        return data;
    }
}
