package br.com.nelmara.physiotherapist.domain.entities.treatment.types.ozonio;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_ozonio_treatment")
public class OzonioTreatment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
