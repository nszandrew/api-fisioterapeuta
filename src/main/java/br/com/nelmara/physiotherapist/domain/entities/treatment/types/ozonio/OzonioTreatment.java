package br.com.nelmara.physiotherapist.domain.entities.treatment.types.ozonio;

import br.com.nelmara.physiotherapist.domain.entities.treatment.Treatment;
import br.com.nelmara.physiotherapist.domain.entities.treatment.history.TreatmentHistory;
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

}
