package br.com.nelmara.physiotherapist.domain.entities.treatment;

import br.com.nelmara.physiotherapist.domain.entities.treatment.dto.UpdateTreatmentDTO;
import br.com.nelmara.physiotherapist.domain.entities.treatment.history.TreatmentHistory;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tb_treatment")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Treatment implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "diagnostic_hypothesis")
    private String diagnosticHypothesis;
    private String pathologies;
    private String description;
    @Column(name = "treatment_type")
    @Enumerated(EnumType.STRING)
    private TreatmentType treatmentType;

    @OneToMany(mappedBy = "treatment", cascade = CascadeType.ALL)
    private List<TreatmentHistory> treatmentHistories;


    public void updateTreatement(UpdateTreatmentDTO data){
        if(data.diagnosticHypothesis() != null){this.diagnosticHypothesis = data.diagnosticHypothesis();}
        if(data.pathologies() != null){this.pathologies = data.pathologies();}
        if(data.description() != null){this.description = data.description();}
        if(data.treatmentType() != null){this.treatmentType = data.treatmentType();}
    }
}
