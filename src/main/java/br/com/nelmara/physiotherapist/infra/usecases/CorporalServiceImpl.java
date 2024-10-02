package br.com.nelmara.physiotherapist.infra.usecases;

import br.com.nelmara.physiotherapist.adapters.repositories.CorporalRepository;
import br.com.nelmara.physiotherapist.adapters.repositories.PatientRepository;
import br.com.nelmara.physiotherapist.adapters.services.CacheService;
import br.com.nelmara.physiotherapist.adapters.services.CorporalService;
import br.com.nelmara.physiotherapist.domain.treatment.types.corporal.CorporalTreatment;
import br.com.nelmara.physiotherapist.domain.treatment.types.corporal.dto.CorporalTreatmentDTO;
import br.com.nelmara.physiotherapist.exceptions.custom.PatientNotFoundException;
import br.com.nelmara.physiotherapist.exceptions.custom.TreatmentNotFoundException;
import br.com.nelmara.physiotherapist.infra.utils.TreatmentHistoryMethods;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class CorporalServiceImpl implements CorporalService {

    private final CorporalRepository repository;
    private final PatientRepository patientRepository;
    private final TreatmentHistoryMethods treatmentHistoryMethods;
    private final CacheService cacheService;
    private final Logger logger = LoggerFactory.getLogger(CorporalServiceImpl.class);

    public CorporalServiceImpl(CorporalRepository repository, PatientRepository patientRepository, TreatmentHistoryMethods treatmentHistoryMethods, CacheService cacheService) {
        this.repository = repository;
        this.patientRepository = patientRepository;
        this.treatmentHistoryMethods = treatmentHistoryMethods;
        this.cacheService = cacheService;
    }

    @Override
    public CorporalTreatmentDTO addCorporal(CorporalTreatmentDTO data, Long id) {
        logger.info("Adding corporal treatment in a patient");
        var patient = patientRepository.findById(id).orElseThrow(() -> new PatientNotFoundException("Patient not found"));
        CorporalTreatment newTreatment = new CorporalTreatment();
        BeanUtils.copyProperties(data, newTreatment);
        repository.save(newTreatment);

        var treatment = repository.findById(newTreatment.getId()).get();

        treatmentHistoryMethods.groupTreatmentToPatientCorporal(patient, treatment);
        cacheService.evictAllCacheValues("Patient");

        return data;
    }

    @Override
    public CorporalTreatmentDTO updateCorporal(CorporalTreatmentDTO data, Long id) {
        logger.info("Updating corporal treatment in a patient");
        var treatment = repository.findById(id).orElseThrow(() -> new TreatmentNotFoundException("Treatment not found"));
        treatment.updateTreatment(data);
        repository.save(treatment);
        cacheService.evictAllCacheValues("Patient");
        return data;
    }

    @Override
    public void delete(Long id) {
        logger.info("deleting a corporal treatment, by id: {}", id);
        if (!(repository.existsById(id))) {throw new TreatmentNotFoundException("Treatment not found, nothing was deleted");}
        repository.deleteById(id);
    }

}
