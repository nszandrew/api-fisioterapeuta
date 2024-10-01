package br.com.nelmara.physiotherapist.domain.treatment.types.corporal;

import br.com.nelmara.physiotherapist.domain.treatment.history.TreatmentHistory;
import br.com.nelmara.physiotherapist.domain.treatment.types.corporal.dto.CorporalTreatmentDTO;
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

    public void updateTreatment(CorporalTreatmentDTO data) {
        if(data.maiorDesconforto() != null){ this.maiorDesconforto = data.maiorDesconforto(); }
        if(data.tempoDesconforto() != null){ this.tempoDesconforto = data.tempoDesconforto(); }
        if(data.tratamento() != null){ this.tratamento = data.tratamento(); }
        if(data.etilismo() != null){ this.etilismo = data.etilismo(); }
        if(data.tabagismo() != null){ this.tabagismo = data.tabagismo(); }
        if(data.atividadeFisica() != null){ this.atividadeFisica = data.atividadeFisica(); }
        if(data.acompanhamentoNutricional() != null){ this.acompanhamentoNutricional = data.acompanhamentoNutricional(); }
        if(data.altura() != null){ this.altura = data.altura(); }
        if(data.pesoAtual() != null){ this.pesoAtual = data.pesoAtual(); }
        if(data.ingestaoAgua() != null){ this.ingestaoAgua = data.ingestaoAgua(); }
        if(data.dataUltimaMenstruacao() != null){ this.dataUltimaMenstruacao = data.dataUltimaMenstruacao(); }
        if(data.acompanhamentoMedico() != null){ this.acompanhamentoMedico = data.acompanhamentoMedico(); }
        if(data.cirurgia() != null){ this.cirurgia = data.cirurgia(); }
        if(data.usoMedicamento() != null){ this.usoMedicamento = data.usoMedicamento(); }
        if(data.medicamentoEmagrecer() != null){ this.medicamentoEmagrecer = data.medicamentoEmagrecer(); }
        if(data.bulimia() != null){ this.bulimia = data.bulimia(); }
        if(data.historicoDoencaFamiliar() != null){ this.historicoDoencaFamiliar = data.historicoDoencaFamiliar(); }
        if(data.retencaoLiquido() != null){ this.retencaoLiquido = data.retencaoLiquido(); }
        if(data.gorduraLocalizada() != null){ this.gorduraLocalizada = data.gorduraLocalizada(); }
        if(data.feg() != null){ this.feg = data.feg(); }
        if(data.flacidezTissular() != null){ this.flacidezTissular = data.flacidezTissular(); }
        if(data.flacidezMuscular() != null){ this.flacidezMuscular = data.flacidezMuscular(); }
        if(data.estria() != null){ this.estria = data.estria(); }
        if(data.mama() != null){ this.mama = data.mama(); }
        if(data.cintura() != null){ this.cintura = data.cintura(); }
        if(data.abdomenUmbigo() != null){ this.abdomenUmbigo = data.abdomenUmbigo(); }
        if(data.abdomenSuperior() != null){ this.abdomenSuperior = data.abdomenSuperior(); }
        if(data.abdomenInferior() != null){ this.abdomenInferior = data.abdomenInferior(); }
        if(data.flancos() != null){ this.flancos = data.flancos(); }
        if(data.quadril() != null){ this.quadril = data.quadril(); }
        if(data.culote() != null){ this.culote = data.culote(); }
        if(data.coxa() != null){ this.coxa = data.coxa(); }
        if(data.joelho() != null){ this.joelho = data.joelho(); }
        if(data.panturrilha() != null){ this.panturrilha = data.panturrilha(); }
        if(data.braco() != null){ this.braco = data.braco(); }
        if(data.gestante() != null){ this.gestante = data.gestante(); }
        if(data.lactentes() != null){ this.lactentes = data.lactentes(); }
        if(data.marcaPasso() != null){ this.marcaPasso = data.marcaPasso(); }
        if(data.implanteCardiaco() != null){ this.implanteCardiaco = data.implanteCardiaco(); }
        if(data.diu() != null){ this.diu = data.diu(); }
        if(data.hipercolesterolemia() != null){ this.hipercolesterolemia = data.hipercolesterolemia(); }
        if(data.historicoHepatite() != null){ this.historicoHepatite = data.historicoHepatite(); }
        if(data.alteracoesSistemaImunologico() != null){ this.alteracoesSistemaImunologico = data.alteracoesSistemaImunologico(); }
        if(data.cancer() != null){ this.cancer = data.cancer(); }
        if(data.insuficienciaLenosaProfunda() != null){ this.insuficienciaLenosaProfunda = data.insuficienciaLenosaProfunda(); }
        if(data.quimioRadioterapia() != null){ this.quimioRadioterapia = data.quimioRadioterapia(); }
        if(data.posCirurgico() != null){ this.posCirurgico = data.posCirurgico(); }
        if(data.pinosProtesesMetalicas() != null){ this.pinosProtesesMetalicas = data.pinosProtesesMetalicas(); }
        if(data.problemasCardiacos() != null){ this.problemasCardiacos = data.problemasCardiacos(); }
        if(data.epilepsia() != null){ this.epilepsia = data.epilepsia(); }
        if(data.queloides() != null){ this.queloides = data.queloides(); }
        if(data.herpes() != null){ this.herpes = data.herpes(); }
        if(data.usoAnticoagulantes() != null){ this.usoAnticoagulantes = data.usoAnticoagulantes(); }
        if(data.labirintite() != null){ this.labirintite = data.labirintite(); }
        if(data.osteoporose() != null){ this.osteoporose = data.osteoporose(); }
        if(data.enxaqueca() != null){ this.enxaqueca = data.enxaqueca(); }
        if(data.herniaDisco() != null){ this.herniaDisco = data.herniaDisco(); }
        if(data.pedrasRins() != null){ this.pedrasRins = data.pedrasRins(); }
        if(data.patologiaAtiva() != null){ this.patologiaAtiva = data.patologiaAtiva(); }
        if(data.trombose() != null){ this.trombose = data.trombose(); }
    }
}
