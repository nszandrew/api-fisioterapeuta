package br.com.nelmara.physiotherapist.domain.entities.treatment.dto;

import br.com.nelmara.physiotherapist.domain.entities.treatment.TreatmentType;
import br.com.nelmara.physiotherapist.domain.entities.treatment.types.corporal.CorporalTreatment;
import br.com.nelmara.physiotherapist.domain.entities.treatment.types.facial.FacialTreatment;
import br.com.nelmara.physiotherapist.domain.entities.treatment.types.neurologica.NeurologicaTreatment;
import br.com.nelmara.physiotherapist.domain.entities.treatment.types.ozonio.OzonioTreatment;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class GetTreatmentDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String diagnosticHypothesis;
    private String pathologies;
    private String description;
    private TreatmentType treatmentType;
    private List<CorporalTreatment> corporalTreatment;
    private List<FacialTreatment> facialTreatment;
    private List<NeurologicaTreatment> neurologicaTreatment;
    private List<OzonioTreatment> ozonioTreatment;

    public GetTreatmentDTO() {}

    public GetTreatmentDTO(String diagnosticHypothesis, String pathologies, String description, TreatmentType treatmentType, List<CorporalTreatment> corporalTreatment, List<FacialTreatment> facialTreatment, List<NeurologicaTreatment> neurologicaTreatment, List<OzonioTreatment> ozonioTreatment) {
        this.diagnosticHypothesis = diagnosticHypothesis;
        this.pathologies = pathologies;
        this.description = description;
        this.treatmentType = treatmentType;
        this.corporalTreatment = corporalTreatment;
        this.facialTreatment = facialTreatment;
        this.neurologicaTreatment = neurologicaTreatment;
        this.ozonioTreatment = ozonioTreatment;
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

    public List<CorporalTreatment> getCorporalTreatment() {
        return corporalTreatment;
    }

    public void setCorporalTreatment(List<CorporalTreatment> corporalTreatment) {
        this.corporalTreatment = corporalTreatment;
    }

    public List<FacialTreatment> getFacialTreatment() {
        return facialTreatment;
    }

    public void setFacialTreatment(List<FacialTreatment> facialTreatment) {
        this.facialTreatment = facialTreatment;
    }

    public List<NeurologicaTreatment> getNeurologicaTreatment() {
        return neurologicaTreatment;
    }

    public void setNeurologicaTreatment(List<NeurologicaTreatment> neurologicaTreatment) {
        this.neurologicaTreatment = neurologicaTreatment;
    }

    public List<OzonioTreatment> getOzonioTreatment() {
        return ozonioTreatment;
    }

    public void setOzonioTreatment(List<OzonioTreatment> ozonioTreatment) {
        this.ozonioTreatment = ozonioTreatment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetTreatmentDTO that = (GetTreatmentDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(diagnosticHypothesis, that.diagnosticHypothesis) && Objects.equals(pathologies, that.pathologies) && Objects.equals(description, that.description) && treatmentType == that.treatmentType && Objects.equals(corporalTreatment, that.corporalTreatment) && Objects.equals(facialTreatment, that.facialTreatment) && Objects.equals(neurologicaTreatment, that.neurologicaTreatment) && Objects.equals(ozonioTreatment, that.ozonioTreatment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, diagnosticHypothesis, pathologies, description, treatmentType, corporalTreatment, facialTreatment, neurologicaTreatment, ozonioTreatment);
    }
}
