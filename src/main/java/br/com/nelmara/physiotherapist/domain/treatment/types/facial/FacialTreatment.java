package br.com.nelmara.physiotherapist.domain.treatment.types.facial;

import br.com.nelmara.physiotherapist.domain.treatment.history.TreatmentHistory;
import br.com.nelmara.physiotherapist.domain.treatment.types.facial.dto.FacialTreatmentDTO;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tb_facial_treatment")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class FacialTreatment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "problema_saude")
    private String problemaSaude;

    @Column(name = "tratamento_medico")
    private String tratamentoMedico;

    @Column(name = "uso_medicamento")
    private String usoMedicamento;

    @Column(name = "uso_hormonio_erva")
    private String usoHormonioErva;

    @Column(name = "uso_antidepressivo")
    private String usoAntidepressivo;

    @Column(name = "uso_anticoncepcional_diu")
    private Boolean usoAnticoncepcionalDiu;

    @Column(name = "uso_drogas_endovenosas")
    private String usoDrogasEndovenosas;

    @Column(name = "alergia_medicamento")
    private String alergiaMedicamento;

    @Column(name = "uso_antibiotico")
    private String usoAntibiotico;

    @Column(name = "problema_coracao")
    private String problemaCoracao;

    @Column(name = "doenca_rins")
    private String doencaRins;

    @Column(name = "problema_tireoide")
    private String problemaTireoide;

    @Column(name = "doenca_figado")
    private Boolean doencaFigado;

    @Column(name = "bronquite_asma")
    private Boolean bronquiteAsma;

    @Column(name = "tuberculose")
    private Boolean tuberculose;

    @Column(name = "febre_frequente")
    private Boolean febreFrequente;

    @Column(name = "diabetes_tipo")
    private String diabetesTipo;

    @Column(name = "epilepsia_convulsoes")
    private Boolean epilepsiaConvulsoes;

    @Column(name = "reumatismo_febre_reumatica")
    private Boolean reumatismoFebreReumatica;

    @Column(name = "gravida_quantos_meses")
    private BigDecimal gravidaQuantosMeses;

    @Column(name = "anemia")
    private Boolean anemia;

    @Column(name = "pressao_arterial_problema")
    private Boolean pressaoArterialProblema;

    @Column(name = "anestesia_problema")
    private String anestesiaProblema;

    @Column(name = "hemorragia_extracao_dentes")
    private Boolean hemorragiaExtracaoDentes;

    @Column(name = "fuma")
    private Boolean fuma;

    @Column(name = "bebe_alcool")
    private Boolean bebeAlcool;

    @Column(name = "tratamento_psicologico_psiquiatrico")
    private String tratamentoPsicologicoPsiquiatrico;

    @Column(name = "doenca_auto_imune")
    private Boolean doencaAutoImune;

    @Column(name = "tratamento_anterior")
    private String tratamentoAnterior;

    @Column(name = "implantes_eletronicos")
    private Boolean implantesEletronicos;

    @Column(name = "tratamento_estetico_anterior")
    private String tratamentoEsteticoAnterior;

    @Column(name = "botox")
    private String botox;

    @Column(name = "preenchimento")
    private String preenchimento;

    @Column(name = "fios_sustentacao")
    private Boolean fiosSustentacao;

    @Column(name = "lift_cirurgico")
    private Boolean liftCirurgico;

    @Column(name = "peeling_quimico")
    private Boolean peelingQuimico;

    @Column(name = "laser")
    private Boolean laser;

    @Column(name = "roacutan")
    private Boolean roacutan;

    @Column(name = "hidroquinona")
    private Boolean hidroquinona;

    @Column(name = "outro_tratamento_estetico")
    private String outroTratamentoEstetico;

    @Column(name = "uso_dermocosmeticos")
    private String usoDermocosmeticos;

    @Column(name = "ultima_limpeza_pele")
    private Date ultimaLimpezaPele;

    @Enumerated(EnumType.STRING)
    @Column(name = "fototipo")
    private Fototipo fototipo;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_pele")
    private TipoPele tipoPele;

    @Column(name = "cravos")
    private Boolean cravos;

    @Column(name = "acne")
    private Boolean acne;

    @Column(name = "million")
    private Boolean million;

    @Column(name = "flacidez_muscular")
    private Boolean flacidezMuscular;

    @Column(name = "flacidez_tissular")
    private Boolean flacidezTissular;

    @Column(name = "cicatriz")
    private String cicatriz;

    @Column(name = "mancha")
    private String mancha;

    @Column(name = "expectativas_tratamento")
    private String expectativasTratamento;

    @Column(name = "observacoes_relevantes")
    private String observacoesRelevantes;

    @Column(name = "fotos_antes_depois")
    private String fotosAntesDepois;

    @OneToMany(mappedBy = "facial", cascade = CascadeType.ALL)
    private List<TreatmentHistory> treatmentHistories;

    public void updateTreatment(FacialTreatmentDTO data) {
        if(data.problemaSaude() != null) { this.problemaSaude = data.problemaSaude(); }
        if(data.tratamentoMedico() != null) { this.tratamentoMedico = data.tratamentoMedico(); }
        if(data.usoMedicamento() != null) { this.usoMedicamento = data.usoMedicamento(); }
        if(data.usoHormonioErva() != null) { this.usoHormonioErva = data.usoHormonioErva(); }
        if(data.usoAntidepressivo() != null) { this.usoAntidepressivo = data.usoAntidepressivo(); }
        if(data.usoAnticoncepcionalDiu() != null) { this.usoAnticoncepcionalDiu = data.usoAnticoncepcionalDiu(); }
        if(data.usoDrogasEndovenosas() != null) { this.usoDrogasEndovenosas = data.usoDrogasEndovenosas(); }
        if(data.alergiaMedicamento() != null) { this.alergiaMedicamento = data.alergiaMedicamento(); }
        if(data.usoAntibiotico() != null) { this.usoAntibiotico = data.usoAntibiotico(); }
        if(data.problemaCoracao() != null) { this.problemaCoracao = data.problemaCoracao(); }
        if(data.doencaRins() != null) { this.doencaRins = data.doencaRins(); }
        if(data.problemaTireoide() != null) { this.problemaTireoide = data.problemaTireoide(); }
        if(data.doencaFigado() != null) { this.doencaFigado = data.doencaFigado(); }
        if(data.bronquiteAsma() != null) { this.bronquiteAsma = data.bronquiteAsma(); }
        if(data.tuberculose() != null) { this.tuberculose = data.tuberculose(); }
        if(data.febreFrequente() != null) { this.febreFrequente = data.febreFrequente(); }
        if(data.diabetesTipo() != null) { this.diabetesTipo = data.diabetesTipo(); }
        if(data.epilepsiaConvulsoes() != null) { this.epilepsiaConvulsoes = data.epilepsiaConvulsoes(); }
        if(data.reumatismoFebreReumatica() != null) { this.reumatismoFebreReumatica = data.reumatismoFebreReumatica(); }
        if(data.gravidaQuantosMeses() != null) { this.gravidaQuantosMeses = data.gravidaQuantosMeses(); }
        if(data.anemia() != null) { this.anemia = data.anemia(); }
        if(data.pressaoArterialProblema() != null) { this.pressaoArterialProblema = data.pressaoArterialProblema(); }
        if(data.anestesiaProblema() != null) { this.anestesiaProblema = data.anestesiaProblema(); }
        if(data.hemorragiaExtracaoDentes() != null) { this.hemorragiaExtracaoDentes = data.hemorragiaExtracaoDentes(); }
        if(data.fuma() != null) { this.fuma = data.fuma(); }
        if(data.bebeAlcool() != null) { this.bebeAlcool = data.bebeAlcool(); }
        if(data.tratamentoPsicologicoPsiquiatrico() != null) { this.tratamentoPsicologicoPsiquiatrico = data.tratamentoPsicologicoPsiquiatrico(); }
        if(data.doencaAutoImune() != null) { this.doencaAutoImune = data.doencaAutoImune(); }
        if(data.tratamentoAnterior() != null) { this.tratamentoAnterior = data.tratamentoAnterior(); }
        if(data.implantesEletronicos() != null) { this.implantesEletronicos = data.implantesEletronicos(); }
        if(data.tratamentoEsteticoAnterior() != null) { this.tratamentoEsteticoAnterior = data.tratamentoEsteticoAnterior(); }
        if(data.botox() != null) { this.botox = data.botox(); }
        if(data.preenchimento() != null) { this.preenchimento = data.preenchimento(); }
        if(data.fiosSustentacao() != null) { this.fiosSustentacao = data.fiosSustentacao(); }
        if(data.liftCirurgico() != null) { this.liftCirurgico = data.liftCirurgico(); }
        if(data.peelingQuimico() != null) { this.peelingQuimico = data.peelingQuimico(); }
        if(data.laser() != null) { this.laser = data.laser(); }
        if(data.roacutan() != null) { this.roacutan = data.roacutan(); }
        if(data.hidroquinona() != null) { this.hidroquinona = data.hidroquinona(); }
        if(data.outroTratamentoEstetico() != null) { this.outroTratamentoEstetico = data.outroTratamentoEstetico(); }
        if(data.usoDermocosmeticos() != null) { this.usoDermocosmeticos = data.usoDermocosmeticos(); }
        if(data.ultimaLimpezaPele() != null) { this.ultimaLimpezaPele = data.ultimaLimpezaPele(); }
        if(data.fototipo() != null) { this.fototipo = data.fototipo(); }
        if(data.tipoPele() != null) { this.tipoPele = data.tipoPele(); }
        if(data.cravos() != null) { this.cravos = data.cravos(); }
        if(data.acne() != null) { this.acne = data.acne(); }
        if(data.million() != null) { this.million = data.million(); }
        if(data.flacidezMuscular() != null) { this.flacidezMuscular = data.flacidezMuscular(); }
        if(data.flacidezTissular() != null) { this.flacidezTissular = data.flacidezTissular(); }
        if(data.cicatriz() != null) { this.cicatriz = data.cicatriz(); }
        if(data.mancha() != null) { this.mancha = data.mancha(); }
        if(data.expectativasTratamento() != null) { this.expectativasTratamento = data.expectativasTratamento(); }
        if(data.observacoesRelevantes() != null) { this.observacoesRelevantes = data.observacoesRelevantes(); }
        if(data.fotosAntesDepois() != null) { this.fotosAntesDepois = data.fotosAntesDepois(); }

    }
}
