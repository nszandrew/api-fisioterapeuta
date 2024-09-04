package br.com.nelmara.physiotherapist.domain.entities.treatment.types.corporal;

import br.com.nelmara.physiotherapist.domain.entities.treatment.Treatment;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_corporal_treatment")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class CorporalTreatment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String maiorDesconforto;
    private String tempoDesconforto;
    private String tratamento;
    private String etilismo;
    private String tabagismo;
    private String atividadeFisica;
    private String acompanhamentoNutricional;
    private BigDecimal altura;
    private BigDecimal pesoAtual;
    private String ingestaoAgua;
    private String dataUltimaMenstruacao;
    private String acompanhamentoMedico;
    private String cirurgia;
    private String usoMedicamento;
    private String medicamentoEmagrecer;
    private String bulimia;
    private String historicoDoencaFamiliar;
    private String retencaoLiquido;
    private String gorduraLocalizada;
    private String feg;
    private String flacidezTissular;
    private String flacidezMuscular;
    private String estria;
    private String mama;
    private BigDecimal cintura;
    private BigDecimal abdomenUmbigo;
    private BigDecimal abdomenSuperior;
    private BigDecimal abdomenInferior;
    private BigDecimal flancos;
    private BigDecimal quadril;
    private BigDecimal culote;
    private BigDecimal coxa;
    private BigDecimal joelho;
    private BigDecimal panturrilha;
    private BigDecimal braco;
    private Boolean gestante;
    private Boolean lactentes;
    private Boolean marcaPasso;
    private Boolean implanteCardiaco;
    private Boolean diu;
    private Boolean hipercolesterolemia;
    private Boolean historicoHepatite;
    private Boolean alteracoesSistemaImunologico;
    private Boolean cancer;
    private Boolean insuficienciaLenosaProfunda;
    private Boolean quimioRadioterapia;
    private Boolean posCirurgico;
    private Boolean pinosProtesesMetalicas;
    private Boolean problemasCardiacos;
    private Boolean epilepsia;
    private Boolean queloides;
    private Boolean herpes;
    private Boolean usoAnticoagulantes;
    private Boolean labirintite;
    private Boolean osteoporose;
    private Boolean enxaqueca;
    private Boolean herniaDisco;
    private Boolean pedrasRins;
    private Boolean patologiaAtiva;
    private Boolean trombose;
    private Integer treatmentId;

    @ManyToOne
    @JoinColumn(name = "treatment_id")
    private Treatment treatment;

}
