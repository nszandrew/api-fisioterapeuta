package br.com.nelmara.physiotherapist.domain.entities.treatment.types.neurologica;

import jakarta.persistence.*;

@Table(name = "tb_neurological_treatment")
@Entity
public class NeurologicaTreatment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
