package br.com.nelmara.physiotherapist.domain.treatment.types.ozonio;

import br.com.nelmara.physiotherapist.domain.treatment.history.TreatmentHistory;
import br.com.nelmara.physiotherapist.domain.treatment.types.ozonio.dto.OzonioTreatmentDTO;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "tb_ozonio_treatment")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class OzonioTreatment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ingestao_agua")
    private String ingestaoAgua;

    @Column(name = "eliminacoes_fisiologicas")
    private String eliminacoesFisiologicas;

    @Column(name = "sono_repouso")
    private String sonoRepouso;

    @Column(name = "habitos_toxicos")
    private String habitosToxicos;

    @Column(name = "postura_trabalho_sentada")
    private Boolean posturaTrabalhoSentada;

    @Column(name = "horas_sentada")
    private BigDecimal horasSentada;

    @Column(name = "postura_trabalho_em_pe")
    private Boolean posturaTrabalhoEmPe;

    @Column(name = "horas_em_pe")
    private BigDecimal horasEmPe;

    @Column(name = "checkup_medico")
    private String checkupMedico;

    @Column(name = "tratamento_ozonio_anterior")
    private Boolean tratamentoOzonioAnterior;

    @Column(name = "hipertireoidismo")
    private Boolean hipertireoidismo;

    @Column(name = "deficiencia_g6pd")
    private String deficienciaG6pd;

    @Column(name = "iam")
    private Boolean iam;

    @Column(name = "anemia_hb")
    private BigDecimal anemiaHb;

    @Column(name = "anemia_ht")
    private BigDecimal anemiaHt;

    @Column(name = "hemocromatose")
    private Boolean hemocromatose;

    @Column(name = "ferro_serico")
    private BigDecimal ferroSerico;

    @Column(name = "trombocitopenia")
    private Boolean trombocitopenia;

    @Column(name = "dm")
    private Boolean dm;

    @Column(name = "glicemia")
    private BigDecimal glicemia;

    @Column(name = "dst")
    private String dst;

    @Column(name = "alergias")
    private String alergias;

    @Column(name = "medicamentos")
    private String medicamentos;

    @Column(name = "cirurgias")
    private String cirurgias;

    @Column(name = "doenca_atual")
    private String doencaAtual;

    @Column(name = "enfermidade_pregressa")
    private String enfermidadePregressa;

    @Column(name = "queixa_principal")
    private String queixaPrincipal;

    @Column(name = "gestante")
    private Boolean gestante;

    @Column(name = "lactentes")
    private Boolean lactentes;

    @Column(name = "marca_passo")
    private Boolean marcaPasso;

    @Column(name = "implante_cardiaco")
    private Boolean implanteCardiaco;

    @Column(name = "diu")
    private Boolean diu;

    @Column(name = "hipercolesterolemia")
    private Boolean hipercolesterolemia;

    @Column(name = "historico_hepatite_doenca_hepatica")
    private Boolean historicoHepatiteDoencaHepatica;

    @Column(name = "alteracoes_sistema_imunologico")
    private Boolean alteracoesSistemaImunologico;

    @Column(name = "cancer")
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

    @Column(name = "epilepsia")
    private Boolean epilepsia;

    @Column(name = "queloides")
    private Boolean queloides;

    @Column(name = "herpes")
    private Boolean herpes;

    @Column(name = "uso_anti_coagulantes")
    private Boolean usoAntiCoagulantes;

    @Column(name = "labirintite")
    private Boolean labirintite;

    @Column(name = "ostioporose")
    private Boolean ostioporose;

    @Column(name = "enxaqueca")
    private Boolean enxaqueca;

    @Column(name = "ernia_de_disco")
    private Boolean erniaDeDisco;

    @Column(name = "pedras_nos_rins")
    private Boolean pedrasNosRins;

    @Column(name = "patologia_ativa")
    private String patologiaAtiva;

    @Column(name = "trombose")
    private Boolean trombose;

    @OneToMany(mappedBy = "ozonio", cascade = CascadeType.ALL)
    private List<TreatmentHistory> treatmentHistories;

    public void updateTreatment(OzonioTreatmentDTO data) {
        if(data.ingestaoAgua() != null) { this.ingestaoAgua = data.ingestaoAgua(); }
        if(data.eliminacoesFisiologicas() != null) { this.eliminacoesFisiologicas = data.eliminacoesFisiologicas(); }
        if(data.sonoRepouso() != null) { this.sonoRepouso = data.sonoRepouso(); }
        if(data.habitosToxicos() != null) { this.habitosToxicos = data.habitosToxicos(); }
        if(data.posturaTrabalhoSentada() != null) { this.posturaTrabalhoSentada = data.posturaTrabalhoSentada(); }
        if(data.horasSentada() != null) { this.horasSentada = data.horasSentada(); }
        if(data.posturaTrabalhoEmPe() != null) { this.posturaTrabalhoEmPe = data.posturaTrabalhoEmPe(); }
        if(data.horasEmPe() != null) { this.horasEmPe = data.horasEmPe(); }
        if(data.checkupMedico() != null) { this.checkupMedico = data.checkupMedico(); }
        if(data.tratamentoOzonioAnterior() != null) { this.tratamentoOzonioAnterior = data.tratamentoOzonioAnterior(); }
        if(data.hipertireoidismo() != null) { this.hipertireoidismo = data.hipertireoidismo(); }
        if(data.deficienciaG6pd() != null) { this.deficienciaG6pd = data.deficienciaG6pd(); }
        if(data.iam() != null) { this.iam = data.iam(); }
        if(data.anemiaHb() != null) { this.anemiaHb = data.anemiaHb(); }
        if(data.anemiaHt() != null) { this.anemiaHt = data.anemiaHt(); }
        if(data.hemocromatose() != null) { this.hemocromatose = data.hemocromatose(); }
        if(data.ferroSerico() != null) { this.ferroSerico = data.ferroSerico(); }
        if(data.trombocitopenia() != null) { this.trombocitopenia = data.trombocitopenia(); }
        if(data.dm() != null) { this.dm = data.dm(); }
        if(data.glicemia() != null) { this.glicemia = data.glicemia(); }
        if(data.dst() != null) { this.dst = data.dst(); }
        if(data.alergias() != null) { this.alergias = data.alergias(); }
        if(data.medicamentos() != null) { this.medicamentos = data.medicamentos(); }
        if(data.cirurgias() != null) { this.cirurgias = data.cirurgias(); }
        if(data.doencaAtual() != null) { this.doencaAtual = data.doencaAtual(); }
        if(data.enfermidadePregressa() != null) { this.enfermidadePregressa = data.enfermidadePregressa(); }
        if(data.queixaPrincipal() != null) { this.queixaPrincipal = data.queixaPrincipal(); }
        if(data.gestante() != null) { this.gestante = data.gestante(); }
        if(data.lactentes() != null) { this.lactentes = data.lactentes(); }
        if(data.marcaPasso() != null) { this.marcaPasso = data.marcaPasso(); }
        if(data.implanteCardiaco() != null) { this.implanteCardiaco = data.implanteCardiaco(); }
        if(data.diu() != null) { this.diu = data.diu(); }
        if(data.hipercolesterolemia() != null) { this.hipercolesterolemia = data.hipercolesterolemia(); }
        if(data.historicoHepatiteDoencaHepatica() != null) { this.historicoHepatiteDoencaHepatica = data.historicoHepatiteDoencaHepatica(); }
        if(data.alteracoesSistemaImunologico() != null) { this.alteracoesSistemaImunologico = data.alteracoesSistemaImunologico(); }
        if(data.cancer() != null) { this.cancer = data.cancer(); }
        if(data.insuficienciaLenosaProfunda() != null) { this.insuficienciaLenosaProfunda = data.insuficienciaLenosaProfunda(); }
        if(data.quimioRadioterapia() != null) { this.quimioRadioterapia = data.quimioRadioterapia(); }
        if(data.posCirurgico() != null) { this.posCirurgico = data.posCirurgico(); }
        if(data.pinosProtesesMetalicas() != null) { this.pinosProtesesMetalicas = data.pinosProtesesMetalicas(); }
        if(data.problemasCardiacos() != null) { this.problemasCardiacos = data.problemasCardiacos(); }
        if(data.epilepsia() != null) { this.epilepsia = data.epilepsia(); }
        if(data.queloides() != null) { this.queloides = data.queloides(); }
        if(data.herpes() != null) { this.herpes = data.herpes(); }
        if(data.usoAntiCoagulantes() != null) { this.usoAntiCoagulantes = data.usoAntiCoagulantes(); }
        if(data.labirintite() != null) { this.labirintite = data.labirintite(); }
        if(data.ostioporose() != null) { this.ostioporose = data.ostioporose(); }
        if(data.enxaqueca() != null) { this.enxaqueca = data.enxaqueca(); }
        if(data.erniaDeDisco() != null) { this.erniaDeDisco = data.erniaDeDisco(); }
        if(data.pedrasNosRins() != null) { this.pedrasNosRins = data.pedrasNosRins(); }
        if(data.patologiaAtiva() != null) { this.patologiaAtiva = data.patologiaAtiva(); }
        if(data.trombose() != null) { this.trombose = data.trombose(); }
    }
}
