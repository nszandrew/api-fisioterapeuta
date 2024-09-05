package br.com.nelmara.physiotherapist.domain.entities.treatment.types.neurologica;

import br.com.nelmara.physiotherapist.domain.entities.treatment.history.TreatmentHistory;
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
}
