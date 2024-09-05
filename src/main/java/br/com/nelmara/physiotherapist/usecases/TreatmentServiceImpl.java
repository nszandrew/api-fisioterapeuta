package br.com.nelmara.physiotherapist.usecases;

import br.com.nelmara.physiotherapist.adapters.repositories.NeurologicalRepository;
import br.com.nelmara.physiotherapist.adapters.repositories.PatientRepository;
import br.com.nelmara.physiotherapist.adapters.repositories.TreatmentRepository;
import br.com.nelmara.physiotherapist.adapters.service.TreatmentService;
import br.com.nelmara.physiotherapist.domain.entities.treatment.Treatment;
import br.com.nelmara.physiotherapist.domain.entities.treatment.dto.TreatmentDTO;
import br.com.nelmara.physiotherapist.domain.entities.treatment.dto.UpdateTreatmentDTO;
import br.com.nelmara.physiotherapist.framework.exceptions.custom.NeurologicalTreatmentNotFoundException;
import br.com.nelmara.physiotherapist.framework.exceptions.custom.PatientNotFoundException;
import br.com.nelmara.physiotherapist.framework.exceptions.custom.TreatmentNotFoundException;
import br.com.nelmara.physiotherapist.framework.utils.TreatmentHistoryMethods;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class TreatmentServiceImpl implements TreatmentService {

    private final TreatmentRepository repository;
    private final PatientRepository patientRepository;
    private final TreatmentHistoryMethods treatmentHistoryMethods;
    private final TreatmentRepository treatmentRepository;
    private final NeurologicalRepository neurologicalRepository;
    private final Logger logger = LoggerFactory.getLogger(TreatmentServiceImpl.class);


    public TreatmentServiceImpl(TreatmentRepository repository, PatientRepository patientRepository, TreatmentRepository treatmentRepository, TreatmentHistoryMethods treatmentHistoryMethods, NeurologicalRepository neurologicalRepository) {
        this.repository = repository;
        this.patientRepository = patientRepository;
        this.treatmentRepository = treatmentRepository;
        this.treatmentHistoryMethods = treatmentHistoryMethods;
        this.neurologicalRepository = neurologicalRepository;
    }

    @Override
    public TreatmentDTO addTreatment(TreatmentDTO data, Long id, Long tratamento) {
        logger.info("Adding treatment to a patient");
        var patient = patientRepository.findById(id).orElseThrow(() -> new PatientNotFoundException("Patient not found"));

        //Adicionar if exists e outros tipos de tratamento
        var neurological = neurologicalRepository.findById(tratamento).orElseThrow(() -> new NeurologicalTreatmentNotFoundException("Not found by id"));

        Treatment newTreatment = new Treatment();
        BeanUtils.copyProperties(data, newTreatment);
        repository.save(newTreatment);
        var treatment = treatmentRepository.findById(newTreatment.getId()).get();
        treatmentHistoryMethods.groupTreatmentToPatient(patient, treatment, neurological);
        return data;
    }



    @Override
    public UpdateTreatmentDTO updateTreatment(UpdateTreatmentDTO data, Long id){
        logger.info("Updating treatment to a patient");
        var treatment = repository.findById(id).orElseThrow(() -> new TreatmentNotFoundException("Treatment ID Not Found! " + id));
        if(treatment.getId() == null){throw new TreatmentNotFoundException("Treatment not found!");}
        treatment.updateTreatement(data);
        repository.save(treatment);
        return data;
    }
}
