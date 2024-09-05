package br.com.nelmara.physiotherapist.framework.utils;

import br.com.nelmara.physiotherapist.domain.entities.patient.Patient;
import br.com.nelmara.physiotherapist.domain.entities.treatment.Treatment;
import br.com.nelmara.physiotherapist.domain.entities.treatment.history.TreatmentHistory;
import br.com.nelmara.physiotherapist.adapters.repositories.TreatmentHistoryRepository;
import br.com.nelmara.physiotherapist.domain.entities.treatment.types.neurologica.NeurologicaTreatment;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TreatmentHistoryMethods {

    private final TreatmentHistoryRepository repository;

    public TreatmentHistoryMethods(TreatmentHistoryRepository repository) {
        this.repository = repository;
    }

    public void groupTreatmentToPatient(Patient patient, Treatment treatment, NeurologicaTreatment tratamento) {
        TreatmentHistory treatmentHistory = new TreatmentHistory();
        treatmentHistory.setPatient(patient);
        treatmentHistory.setTreatment(treatment);
        treatmentHistory.setTreatmentDate(new Date());
        treatmentHistory.setNeurological(tratamento);
        repository.save(treatmentHistory);
    }
}
