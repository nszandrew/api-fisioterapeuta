package br.com.nelmara.physiotherapist.infra.usecases;

import br.com.nelmara.physiotherapist.adapters.repositories.OzonioRepository;
import br.com.nelmara.physiotherapist.adapters.repositories.PatientRepository;
import br.com.nelmara.physiotherapist.adapters.services.CacheService;
import br.com.nelmara.physiotherapist.adapters.services.OzonioService;
import br.com.nelmara.physiotherapist.domain.treatment.types.ozonio.OzonioTreatment;
import br.com.nelmara.physiotherapist.domain.treatment.types.ozonio.dto.OzonioTreatmentDTO;
import br.com.nelmara.physiotherapist.exceptions.custom.PatientNotFoundException;
import br.com.nelmara.physiotherapist.exceptions.custom.TreatmentNotFoundException;
import br.com.nelmara.physiotherapist.infra.utils.TreatmentHistoryMethods;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class OzonioServiceImpl implements OzonioService {


    private final OzonioRepository repository;
    private final PatientRepository patientRepository;
    private final TreatmentHistoryMethods treatmentHistoryMethods;
    private final CacheService cacheService;
    private final Logger logger = LoggerFactory.getLogger(FacialServiceImpl.class);

    public OzonioServiceImpl(OzonioRepository repository, PatientRepository patientRepository, TreatmentHistoryMethods treatmentHistoryMethods, CacheService cacheService) {
        this.repository = repository;
        this.patientRepository = patientRepository;
        this.treatmentHistoryMethods = treatmentHistoryMethods;
        this.cacheService = cacheService;
    }


    @Override
    public OzonioTreatmentDTO addOzonioTreatment(OzonioTreatmentDTO data, Long id) {
        logger.info("Adding Ozonio treatment in a patient");
        var patient = patientRepository.findById(id).orElseThrow(() -> new PatientNotFoundException("Patient not found"));

        OzonioTreatment newTreatment = new OzonioTreatment();
        BeanUtils.copyProperties(data, newTreatment);
        repository.save(newTreatment);

        var treatment = repository.findById(newTreatment.getId()).get();

        treatmentHistoryMethods.groupTreatmentToPatientOzonio(patient, treatment);
        cacheService.evictAllCacheValues("Patient");

        return data;
    }

    @Override
    public OzonioTreatmentDTO updateOzonioTreatment(OzonioTreatmentDTO data, Long id) {
        logger.info("Updating ozonio treatment in a patient");
        var treatment = repository.findById(id).orElseThrow(() -> new TreatmentNotFoundException("Treatment not found"));
        treatment.updateTreatment(data);
        repository.save(treatment);
        cacheService.evictAllCacheValues("Patient");
        return data;
    }

    @Override
    public void delete(Long id) {
        logger.info("deleting a facial treatment, by id: {}", id);
        if (!(repository.existsById(id))) {throw new TreatmentNotFoundException("Treatment not found, nothing was deleted");}
        repository.deleteById(id);
    }
}
