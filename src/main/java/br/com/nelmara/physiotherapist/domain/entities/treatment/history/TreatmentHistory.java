package br.com.nelmara.physiotherapist.domain.entities.treatment.history;

import br.com.nelmara.physiotherapist.domain.entities.patient.Patient;
import br.com.nelmara.physiotherapist.domain.entities.treatment.types.corporal.CorporalTreatment;
import br.com.nelmara.physiotherapist.domain.entities.treatment.types.facial.FacialTreatment;
import br.com.nelmara.physiotherapist.domain.entities.treatment.types.neurologica.NeurologicaTreatment;
import br.com.nelmara.physiotherapist.domain.entities.treatment.types.ozonio.OzonioTreatment;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tb_treatment_history")
@Getter
@Setter
public class TreatmentHistory implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "treatment_date")
    private Date treatmentDate;
    private String progress;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;


    @ManyToOne
    @JoinColumn(name = "corporal_id")
    private CorporalTreatment corporal;

    @ManyToOne
    @JoinColumn(name = "facial_id")
    private FacialTreatment facial;

    @ManyToOne
    @JoinColumn(name = "neurological_id")
    private NeurologicaTreatment neurological;

    @ManyToOne
    @JoinColumn(name = "ozonio_id")
    private OzonioTreatment ozonio;
}
