package br.com.nelmara.physiotherapist.domain.entities.treatment.history.dto;

import br.com.nelmara.physiotherapist.domain.entities.treatment.dto.GetTreatmentDTO;

import java.util.Date;
import java.util.Objects;

public class GetTreatmentHistoryDTO {

    private Long id;
    private Date treatmentDate;
    private String progress;
    private GetTreatmentDTO treatment;

    public GetTreatmentHistoryDTO() {}

    public GetTreatmentHistoryDTO(Long id, Date treatmentDate, String progress, GetTreatmentDTO treatment) {
        this.id = id;
        this.treatmentDate = treatmentDate;
        this.progress = progress;
        this.treatment = treatment;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetTreatmentHistoryDTO that = (GetTreatmentHistoryDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(treatmentDate, that.treatmentDate) && Objects.equals(progress, that.progress) && Objects.equals(treatment, that.treatment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, treatmentDate, progress, treatment);
    }
}
