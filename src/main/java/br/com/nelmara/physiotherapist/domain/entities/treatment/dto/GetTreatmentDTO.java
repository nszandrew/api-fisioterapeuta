package br.com.nelmara.physiotherapist.domain.entities.treatment.dto;

import br.com.nelmara.physiotherapist.domain.entities.treatment.TreatmentType;

import java.io.Serializable;
import java.util.Objects;

public class GetTreatmentDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String diagnosticHypothesis;
    private String pathologies;
    private String description;
    private TreatmentType treatmentType;


    public GetTreatmentDTO() {}

    public GetTreatmentDTO(String diagnosticHypothesis, String pathologies, String description, TreatmentType treatmentType) {
        this.diagnosticHypothesis = diagnosticHypothesis;
        this.pathologies = pathologies;
        this.description = description;
        this.treatmentType = treatmentType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDiagnosticHypothesis() {
        return diagnosticHypothesis;
    }

    public void setDiagnosticHypothesis(String diagnosticHypothesis) {
        this.diagnosticHypothesis = diagnosticHypothesis;
    }

    public String getPathologies() {
        return pathologies;
    }

    public void setPathologies(String pathologies) {
        this.pathologies = pathologies;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TreatmentType getTreatmentType() {
        return treatmentType;
    }

    public void setTreatmentType(TreatmentType treatmentType) {
        this.treatmentType = treatmentType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetTreatmentDTO that = (GetTreatmentDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(diagnosticHypothesis, that.diagnosticHypothesis) && Objects.equals(pathologies, that.pathologies) && Objects.equals(description, that.description) && treatmentType == that.treatmentType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, diagnosticHypothesis, pathologies, description, treatmentType);
    }
}
