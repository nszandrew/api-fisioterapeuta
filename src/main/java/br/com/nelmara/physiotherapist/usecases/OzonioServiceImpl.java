package br.com.nelmara.physiotherapist.usecases;

import br.com.nelmara.physiotherapist.adapters.repositories.OzonioRepository;
import br.com.nelmara.physiotherapist.adapters.repositories.PatientRepository;
import br.com.nelmara.physiotherapist.adapters.service.CacheService;
import br.com.nelmara.physiotherapist.adapters.service.OzonioService;
import br.com.nelmara.physiotherapist.domain.entities.treatment.types.facial.FacialTreatment;
import br.com.nelmara.physiotherapist.domain.entities.treatment.types.ozonio.OzonioTreatment;
import br.com.nelmara.physiotherapist.domain.entities.treatment.types.ozonio.dto.OzonioTreatmentDTO;
import br.com.nelmara.physiotherapist.framework.exceptions.custom.PatientNotFoundException;
import br.com.nelmara.physiotherapist.framework.utils.TreatmentHistoryMethods;
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
}
