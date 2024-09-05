package br.com.nelmara.physiotherapist.domain.entities.treatment.history.dto;

import br.com.nelmara.physiotherapist.domain.entities.treatment.dto.GetTreatmentDTO;
import br.com.nelmara.physiotherapist.domain.entities.treatment.types.corporal.GetCorporalTreatmentDTO;
import br.com.nelmara.physiotherapist.domain.entities.treatment.types.facial.GetFacialTreatmentDTO;
import br.com.nelmara.physiotherapist.domain.entities.treatment.types.neurologica.GetNeurologicaDTO;
import br.com.nelmara.physiotherapist.domain.entities.treatment.types.ozonio.GetOzonioTreatmentDTO;

import java.util.Date;
import java.util.Objects;

public class GetTreatmentHistoryDTO {

    private Long id;
    private Date treatmentDate;
    private String progress;
    private GetTreatmentDTO treatment;
    private GetNeurologicaDTO neurological;
    private GetFacialTreatmentDTO facial;
    private GetOzonioTreatmentDTO ozonio;
    private GetCorporalTreatmentDTO corporal;

    public GetTreatmentHistoryDTO() {}

    public GetTreatmentHistoryDTO(Date treatmentDate, String progress, GetTreatmentDTO treatment, GetNeurologicaDTO neurologica, GetFacialTreatmentDTO facial, GetOzonioTreatmentDTO ozonio, GetCorporalTreatmentDTO corporal) {
        this.treatmentDate = treatmentDate;
        this.progress = progress;
        this.treatment = treatment;
        this.neurological = neurologica;
        this.facial = facial;
        this.ozonio = ozonio;
        this.corporal = corporal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTreatmentDate() {
        return treatmentDate;
    }

    public void setTreatmentDate(Date treatmentDate) {
        this.treatmentDate = treatmentDate;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public GetTreatmentDTO getTreatment() {
        return treatment;
    }

    public void setTreatment(GetTreatmentDTO treatment) {
        this.treatment = treatment;
    }

    public GetNeurologicaDTO getNeurological() {
        return neurological;
    }

    public void setNeurological(GetNeurologicaDTO neurological) {
        this.neurological = neurological;
    }

    public GetFacialTreatmentDTO getFacial() {
        return facial;
    }

    public void setFacial(GetFacialTreatmentDTO facial) {
        this.facial = facial;
    }

    public GetOzonioTreatmentDTO getOzonio() {
        return ozonio;
    }

    public void setOzonio(GetOzonioTreatmentDTO ozonio) {
        this.ozonio = ozonio;
    }

    public GetCorporalTreatmentDTO getCorporal() {
        return corporal;
    }

    public void setCorporal(GetCorporalTreatmentDTO corporal) {
        this.corporal = corporal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetTreatmentHistoryDTO that = (GetTreatmentHistoryDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(treatmentDate, that.treatmentDate) && Objects.equals(progress, that.progress) && Objects.equals(treatment, that.treatment) && Objects.equals(neurological, that.neurological) && Objects.equals(facial, that.facial) && Objects.equals(ozonio, that.ozonio) && Objects.equals(corporal, that.corporal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, treatmentDate, progress, treatment, neurological, facial, ozonio, corporal);
    }
}
