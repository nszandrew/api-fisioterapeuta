package br.com.nelmara.physiotherapist.domain.treatment.types.neurologica;

import br.com.nelmara.physiotherapist.domain.treatment.history.TreatmentHistory;
import br.com.nelmara.physiotherapist.domain.treatment.types.neurologica.dto.NeurologicalDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name = "tb_neurological_treatment")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class NeurologicaTreatment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String hmp;
    private String hma;
    @Column(name = "padrao_postural")
    private String padraoPostural;
    @Column(name = "forca_muscular")
    private String forcaMuscular;
    private String marcha;
    @Column(name = "trocas_posturais")
    private String trocasPosturais;
    private String orientacoes;

    @OneToMany(mappedBy = "neurological", cascade = CascadeType.ALL)
    private List<TreatmentHistory> treatmentHistories;

    public void updateTreatment(NeurologicalDTO data) {
        if(data.hmp() != null) { this.hmp = data.hmp(); }
        if(data.hma() != null) { this.hma = data.hma(); }
        if(data.padraoPostural() != null) { this.padraoPostural = data.padraoPostural(); }
        if(data.forcaMuscular() != null) { this.forcaMuscular = data.forcaMuscular(); }
        if(data.marcha() != null) { this.marcha = data.marcha(); }
        if(data.trocasPosturais() != null) { this.trocasPosturais = data.trocasPosturais(); }
        if(data.orientacoes() != null) { this.orientacoes = data.orientacoes(); }
    }
}
