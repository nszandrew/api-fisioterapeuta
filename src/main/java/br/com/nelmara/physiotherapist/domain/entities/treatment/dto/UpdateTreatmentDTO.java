package br.com.nelmara.physiotherapist.domain.entities.treatment.dto;

import br.com.nelmara.physiotherapist.domain.entities.treatment.TreatmentType;
import jakarta.persistence.Column;

public record UpdateTreatmentDTO(
        @Column(name = "diagnostic_hypothesis")
        String diagnosticHypothesis,
        @Column(name = "pathologies")
        String pathologies,
        @Column(name = "description")
        String description,
        @Column(name = "treatment_type")
        TreatmentType treatmentType
) {
}
