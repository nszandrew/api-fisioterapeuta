package br.com.nelmara.physiotherapist.usecases.utils;

import br.com.nelmara.physiotherapist.domain.patient.Patient;
import br.com.nelmara.physiotherapist.domain.treatment.history.TreatmentHistory;
import br.com.nelmara.physiotherapist.adapters.repositories.TreatmentHistoryRepository;
import br.com.nelmara.physiotherapist.domain.treatment.types.corporal.CorporalTreatment;
import br.com.nelmara.physiotherapist.domain.treatment.types.facial.FacialTreatment;
import br.com.nelmara.physiotherapist.domain.treatment.types.neurologica.NeurologicaTreatment;
import br.com.nelmara.physiotherapist.domain.treatment.types.ozonio.OzonioTreatment;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TreatmentHistoryMethods {

    private final TreatmentHistoryRepository repository;

    public TreatmentHistoryMethods(TreatmentHistoryRepository repository) {
        this.repository = repository;
    }

    public void groupTreatmentToPatientNeurological(Patient patient, NeurologicaTreatment neurologicaTreatment) {
        TreatmentHistory treatmentHistory = new TreatmentHistory();
        treatmentHistory.setPatient(patient);
        treatmentHistory.setNeurological(neurologicaTreatment);
        treatmentHistory.setTreatmentDate(new Date());

        repository.save(treatmentHistory);
    }

    public void groupTreatmentToPatientCorporal(Patient patient, CorporalTreatment treatment) {
        TreatmentHistory treatmentHistory = new TreatmentHistory();
            treatmentHistory.setPatient(patient);
            treatmentHistory.setCorporal(treatment);
            treatmentHistory.setTreatmentDate(new Date());

            repository.save(treatmentHistory);
    }

    public void groupTreatmentToPatientFacial(Patient patient, FacialTreatment treatment) {
        TreatmentHistory treatmentHistory = new TreatmentHistory();
        treatmentHistory.setPatient(patient);
        treatmentHistory.setFacial(treatment);
        treatmentHistory.setTreatmentDate(new Date());

        repository.save(treatmentHistory);
    }

    public void groupTreatmentToPatientOzonio(Patient patient, OzonioTreatment treatment) {
        TreatmentHistory treatmentHistory = new TreatmentHistory();
        treatmentHistory.setPatient(patient);
        treatmentHistory.setOzonio(treatment);
        treatmentHistory.setTreatmentDate(new Date());

        repository.save(treatmentHistory);
    }
}
