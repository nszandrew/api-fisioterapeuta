package br.com.nelmara.physiotherapist.domain.entities.treatment.dto;

import br.com.nelmara.physiotherapist.domain.entities.treatment.TreatmentType;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;

public record TreatmentDTO(
        @NotBlank(message = "Campo obrigatorio!")
        @Column(name = "diagnostic_hypothesis")
        String diagnosticHypothesis,
        String pathologies,
        String description,
        @JsonFormat(shape = JsonFormat.Shape.STRING)
        @Column(name = "treatment_type")
        TreatmentType treatmentType) {
}
