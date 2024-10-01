package br.com.nelmara.physiotherapist.usecases;

import br.com.nelmara.physiotherapist.adapters.repositories.NeurologicalRepository;
import br.com.nelmara.physiotherapist.adapters.repositories.PatientRepository;
import br.com.nelmara.physiotherapist.adapters.service.CacheService;
import br.com.nelmara.physiotherapist.adapters.service.NeurologicalService;
import br.com.nelmara.physiotherapist.domain.treatment.types.neurologica.NeurologicaTreatment;
import br.com.nelmara.physiotherapist.domain.treatment.types.neurologica.dto.NeurologicalDTO;
import br.com.nelmara.physiotherapist.exceptions.custom.PatientNotFoundException;
import br.com.nelmara.physiotherapist.exceptions.custom.TreatmentNotFoundException;
import br.com.nelmara.physiotherapist.usecases.utils.TreatmentHistoryMethods;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class NeurologicalServiceImpl implements NeurologicalService {

    private final NeurologicalRepository repository;
    private final PatientRepository patientRepository;
    private final CacheService cacheService;
    private final TreatmentHistoryMethods treatmentHistoryMethods;
    private final Logger logger = LoggerFactory.getLogger(NeurologicalServiceImpl.class);

    public NeurologicalServiceImpl(NeurologicalRepository repository, PatientRepository patientRepository, CacheService cacheService, TreatmentHistoryMethods treatmentHistoryMethods) {
        this.repository = repository;
        this.patientRepository = patientRepository;
        this.cacheService = cacheService;
        this.treatmentHistoryMethods = treatmentHistoryMethods;
    }


    @Override
    public NeurologicalDTO addNeurologicalService(NeurologicalDTO data, Long id) {
        logger.info("Adding neurological treatment in a patient");
        var patient = patientRepository.findById(id).orElseThrow(() -> new PatientNotFoundException("Patient not found"));

        NeurologicaTreatment newTreatment = new NeurologicaTreatment();
        BeanUtils.copyProperties(data, newTreatment);
        repository.save(newTreatment);

        var treatment = repository.findById(newTreatment.getId()).get();

        treatmentHistoryMethods.groupTreatmentToPatientNeurological(patient, treatment);
        cacheService.evictAllCacheValues("Patient");

        return data;
    }

    @Override
    public NeurologicalDTO updateNeurologicalService(NeurologicalDTO data, Long id) {
        logger.info("Updating neurological treatment in a patient");
        var treatment = repository.findById(id).orElseThrow(() -> new TreatmentNotFoundException("Treatment not found"));
        treatment.updateTreatment(data);
        repository.save(treatment);
        cacheService.evictAllCacheValues("Patient");
        return data;
    }

    @Override
    public void delete(Long id) {
        logger.info("deleting a neurological treatment, by id: {}", id);
        if (!(repository.existsById(id))) {throw new TreatmentNotFoundException("Treatment not found, nothing was deleted");}
        repository.deleteById(id);
    }
}
