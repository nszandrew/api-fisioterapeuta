package br.com.nelmara.physiotherapist.domain.entities.treatment.types.corporal;

import br.com.nelmara.physiotherapist.domain.entities.treatment.history.TreatmentHistory;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

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

    @Column(name = "maior_desconforto")
    private String maiorDesconforto;
    @Column(name = "tempo_desconforto")
    private String tempoDesconforto;
    private String tratamento;
    private String etilismo;
    private String tabagismo;
    @Column(name = "atividade_fisica")
    private String atividadeFisica;
    @Column(name = "acompanhamento_nutricional")
    private String acompanhamentoNutricional;
    private BigDecimal altura;
    @Column(name = "peso_atual")
    private BigDecimal pesoAtual;
    @Column(name = "ingestao_agua")
    private String ingestaoAgua;
    @Column(name = "data_ultima_menstruacao")
    private String dataUltimaMenstruacao;
    @Column(name = "acompanhamento_medico")
    private String acompanhamentoMedico;
    private String cirurgia;
    @Column(name = "uso_medicamento")
    private String usoMedicamento;
    @Column(name = "medicamento_emagrecer")
    private String medicamentoEmagrecer;
    private String bulimia;
    @Column(name = "historico_doenca_familiar")
    private String historicoDoencaFamiliar;
    @Column(name = "retencao_liquido")
    private String retencaoLiquido;
    @Column(name = "gordura_localizada")
    private String gorduraLocalizada;
    private String feg;
    @Column(name = "flacidez_tissular")
    private String flacidezTissular;
    @Column(name = "flacidez_muscular")
    private String flacidezMuscular;
    private String estria;
    private String mama;
    private BigDecimal cintura;
    @Column(name = "abdomen_umbigo")
    private BigDecimal abdomenUmbigo;
    @Column(name = "abdomen_superior")
    private BigDecimal abdomenSuperior;
    @Column(name = "abdomen_inferior")
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
    @Column(name = "marca_passo")
    private Boolean marcaPasso;
    @Column(name = "implante_cardiaco")
    private Boolean implanteCardiaco;
    private Boolean diu;
    private Boolean hipercolesterolemia;
    @Column(name = "historico_hepatite")
    private Boolean historicoHepatite;
    @Column(name = "alteracoes_sistema_imunologico")
    private Boolean alteracoesSistemaImunologico;
    private Boolean cancer;
    @Column(name = "insuficiencia_lenosa_profunda")
    private Boolean insuficienciaLenosaProfunda;
    @Column(name = "quimio_radioterapia")
    private Boolean quimioRadioterapia;
    @Column(name = "pos_cirurgico")
    private Boolean posCirurgico;
    @Column(name = "pinos_proteses_metalicas")
    private Boolean pinosProtesesMetalicas;
    @Column(name = "problemas_cardiacos")
    private Boolean problemasCardiacos;
    private Boolean epilepsia;
    private Boolean queloides;
    private Boolean herpes;
    @Column(name = "uso_anticoagulantes")
    private Boolean usoAnticoagulantes;
    private Boolean labirintite;
    private Boolean osteoporose;
    private Boolean enxaqueca;
    @Column(name = "hernia_disco")
    private Boolean herniaDisco;
    @Column(name = "pedras_rins")
    private Boolean pedrasRins;
    @Column(name = "patologia_ativa")
    private Boolean patologiaAtiva;
    private Boolean trombose;

    @OneToMany(mappedBy = "corporal", cascade = CascadeType.ALL)
    private List<TreatmentHistory> treatmentHistories;

}
