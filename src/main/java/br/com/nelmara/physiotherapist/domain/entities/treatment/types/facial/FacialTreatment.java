package br.com.nelmara.physiotherapist.domain.entities.treatment.types.facial;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_facial_treatment")
public class FacialTreatment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
