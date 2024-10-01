package br.com.nelmara.physiotherapist.domain.treatment.types.facial.dto;

import br.com.nelmara.physiotherapist.domain.treatment.types.facial.Fototipo;
import br.com.nelmara.physiotherapist.domain.treatment.types.facial.TipoPele;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class GetFacialTreatmentDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String problemaSaude;
    private String tratamentoMedico;
    private String usoMedicamento;
    private String usoHormonioErva;
    private String usoAntidepressivo;
    private Boolean usoAnticoncepcionalDiu;
    private String usoDrogasEndovenosas;
    private String alergiaMedicamento;
    private String usoAntibiotico;
    private String problemaCoracao;
    private String doencaRins;
    private String problemaTireoide;
    private Boolean doencaFigado;
    private Boolean bronquiteAsma;
    private Boolean tuberculose;
    private Boolean febreFrequente;
    private String diabetesTipo;
    private Boolean epilepsiaConvulsoes;
    private Boolean reumatismoFebreReumatica;
    private BigDecimal gravidaQuantosMeses;
    private Boolean anemia;
    private Boolean pressaoArterialProblema;
    private String anestesiaProblema;
    private Boolean hemorragiaExtracaoDentes;
    private Boolean fuma;
    private Boolean bebeAlcool;
    private String tratamentoPsicologicoPsiquiatrico;
    private Boolean doencaAutoImune;
    private String tratamentoAnterior;
    private Boolean implantesEletronicos;
    private String tratamentoEsteticoAnterior;
    private String botox;
    private String preenchimento;
    private Boolean fiosSustentacao;
    private Boolean liftCirurgico;
    private Boolean peelingQuimico;
    private Boolean laser;
    private Boolean roacutan;
    private Boolean hidroquinona;
    private String outroTratamentoEstetico;
    private String usoDermocosmeticos;
    private Date ultimaLimpezaPele;
    private Fototipo fototipo;
    private TipoPele tipoPele;
    private Boolean cravos;
    private Boolean acne;
    private Boolean million;
    private Boolean flacidezMuscular;
    private Boolean flacidezTissular;
    private String cicatriz;
    private String mancha;
    private String expectativasTratamento;
    private String observacoesRelevantes;
    private String fotosAntesDepois;

    public GetFacialTreatmentDTO() {}

    public GetFacialTreatmentDTO(String problemaSaude, String tratamentoMedico, String usoMedicamento, String usoHormonioErva, String usoAntidepressivo, Boolean usoAnticoncepcionalDiu, String usoDrogasEndovenosas, String alergiaMedicamento, String usoAntibiotico, String problemaCoracao, String doencaRins, String problemaTireoide, Boolean doencaFigado, Boolean bronquiteAsma, Boolean tuberculose, Boolean febreFrequente, String diabetesTipo, Boolean epilepsiaConvulsoes, Boolean reumatismoFebreReumatica, BigDecimal gravidaQuantosMeses, Boolean anemia, Boolean pressaoArterialProblema, String anestesiaProblema, Boolean hemorragiaExtracaoDentes, Boolean fuma, Boolean bebeAlcool, String tratamentoPsicologicoPsiquiatrico, Boolean doencaAutoImune, String tratamentoAnterior, Boolean implantesEletronicos, String tratamentoEsteticoAnterior, String botox, String preenchimento, Boolean fiosSustentacao, Boolean liftCirurgico, Boolean peelingQuimico, Boolean laser, Boolean roacutan, Boolean hidroquinona, String outroTratamentoEstetico, String usoDermocosmeticos, Date ultimaLimpezaPele, Fototipo fototipo, TipoPele tipoPele, Boolean cravos, Boolean acne, Boolean million, Boolean flacidezMuscular, Boolean flacidezTissular, String cicatriz, String mancha, String expectativasTratamento, String observacoesRelevantes, String fotosAntesDepois) {
        this.problemaSaude = problemaSaude;
        this.tratamentoMedico = tratamentoMedico;
        this.usoMedicamento = usoMedicamento;
        this.usoHormonioErva = usoHormonioErva;
        this.usoAntidepressivo = usoAntidepressivo;
        this.usoAnticoncepcionalDiu = usoAnticoncepcionalDiu;
        this.usoDrogasEndovenosas = usoDrogasEndovenosas;
        this.alergiaMedicamento = alergiaMedicamento;
        this.usoAntibiotico = usoAntibiotico;
        this.problemaCoracao = problemaCoracao;
        this.doencaRins = doencaRins;
        this.problemaTireoide = problemaTireoide;
        this.doencaFigado = doencaFigado;
        this.bronquiteAsma = bronquiteAsma;
        this.tuberculose = tuberculose;
        this.febreFrequente = febreFrequente;
        this.diabetesTipo = diabetesTipo;
        this.epilepsiaConvulsoes = epilepsiaConvulsoes;
        this.reumatismoFebreReumatica = reumatismoFebreReumatica;
        this.gravidaQuantosMeses = gravidaQuantosMeses;
        this.anemia = anemia;
        this.pressaoArterialProblema = pressaoArterialProblema;
        this.anestesiaProblema = anestesiaProblema;
        this.hemorragiaExtracaoDentes = hemorragiaExtracaoDentes;
        this.fuma = fuma;
        this.bebeAlcool = bebeAlcool;
        this.tratamentoPsicologicoPsiquiatrico = tratamentoPsicologicoPsiquiatrico;
        this.doencaAutoImune = doencaAutoImune;
        this.tratamentoAnterior = tratamentoAnterior;
        this.implantesEletronicos = implantesEletronicos;
        this.tratamentoEsteticoAnterior = tratamentoEsteticoAnterior;
        this.botox = botox;
        this.preenchimento = preenchimento;
        this.fiosSustentacao = fiosSustentacao;
        this.liftCirurgico = liftCirurgico;
        this.peelingQuimico = peelingQuimico;
        this.laser = laser;
        this.roacutan = roacutan;
        this.hidroquinona = hidroquinona;
        this.outroTratamentoEstetico = outroTratamentoEstetico;
        this.usoDermocosmeticos = usoDermocosmeticos;
        this.ultimaLimpezaPele = ultimaLimpezaPele;
        this.fototipo = fototipo;
        this.tipoPele = tipoPele;
        this.cravos = cravos;
        this.acne = acne;
        this.million = million;
        this.flacidezMuscular = flacidezMuscular;
        this.flacidezTissular = flacidezTissular;
        this.cicatriz = cicatriz;
        this.mancha = mancha;
        this.expectativasTratamento = expectativasTratamento;
        this.observacoesRelevantes = observacoesRelevantes;
        this.fotosAntesDepois = fotosAntesDepois;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProblemaSaude() {
        return problemaSaude;
    }

    public void setProblemaSaude(String problemaSaude) {
        this.problemaSaude = problemaSaude;
    }

    public String getTratamentoMedico() {
        return tratamentoMedico;
    }

    public void setTratamentoMedico(String tratamentoMedico) {
        this.tratamentoMedico = tratamentoMedico;
    }

    public String getUsoMedicamento() {
        return usoMedicamento;
    }

    public void setUsoMedicamento(String usoMedicamento) {
        this.usoMedicamento = usoMedicamento;
    }

    public String getUsoHormonioErva() {
        return usoHormonioErva;
    }

    public void setUsoHormonioErva(String usoHormonioErva) {
        this.usoHormonioErva = usoHormonioErva;
    }

    public String getUsoAntidepressivo() {
        return usoAntidepressivo;
    }

    public void setUsoAntidepressivo(String usoAntidepressivo) {
        this.usoAntidepressivo = usoAntidepressivo;
    }

    public Boolean getUsoAnticoncepcionalDiu() {
        return usoAnticoncepcionalDiu;
    }

    public void setUsoAnticoncepcionalDiu(Boolean usoAnticoncepcionalDiu) {
        this.usoAnticoncepcionalDiu = usoAnticoncepcionalDiu;
    }

    public String getUsoDrogasEndovenosas() {
        return usoDrogasEndovenosas;
    }

    public void setUsoDrogasEndovenosas(String usoDrogasEndovenosas) {
        this.usoDrogasEndovenosas = usoDrogasEndovenosas;
    }

    public String getAlergiaMedicamento() {
        return alergiaMedicamento;
    }

    public void setAlergiaMedicamento(String alergiaMedicamento) {
        this.alergiaMedicamento = alergiaMedicamento;
    }

    public String getUsoAntibiotico() {
        return usoAntibiotico;
    }

    public void setUsoAntibiotico(String usoAntibiotico) {
        this.usoAntibiotico = usoAntibiotico;
    }

    public String getProblemaCoracao() {
        return problemaCoracao;
    }

    public void setProblemaCoracao(String problemaCoracao) {
        this.problemaCoracao = problemaCoracao;
    }

    public String getDoencaRins() {
        return doencaRins;
    }

    public void setDoencaRins(String doencaRins) {
        this.doencaRins = doencaRins;
    }

    public String getProblemaTireoide() {
        return problemaTireoide;
    }

    public void setProblemaTireoide(String problemaTireoide) {
        this.problemaTireoide = problemaTireoide;
    }

    public Boolean getDoencaFigado() {
        return doencaFigado;
    }

    public void setDoencaFigado(Boolean doencaFigado) {
        this.doencaFigado = doencaFigado;
    }

    public Boolean getBronquiteAsma() {
        return bronquiteAsma;
    }

    public void setBronquiteAsma(Boolean bronquiteAsma) {
        this.bronquiteAsma = bronquiteAsma;
    }

    public Boolean getTuberculose() {
        return tuberculose;
    }

    public void setTuberculose(Boolean tuberculose) {
        this.tuberculose = tuberculose;
    }

    public Boolean getFebreFrequente() {
        return febreFrequente;
    }

    public void setFebreFrequente(Boolean febreFrequente) {
        this.febreFrequente = febreFrequente;
    }

    public String getDiabetesTipo() {
        return diabetesTipo;
    }

    public void setDiabetesTipo(String diabetesTipo) {
        this.diabetesTipo = diabetesTipo;
    }

    public Boolean getEpilepsiaConvulsoes() {
        return epilepsiaConvulsoes;
    }

    public void setEpilepsiaConvulsoes(Boolean epilepsiaConvulsoes) {
        this.epilepsiaConvulsoes = epilepsiaConvulsoes;
    }

    public Boolean getReumatismoFebreReumatica() {
        return reumatismoFebreReumatica;
    }

    public void setReumatismoFebreReumatica(Boolean reumatismoFebreReumatica) {
        this.reumatismoFebreReumatica = reumatismoFebreReumatica;
    }

    public BigDecimal getGravidaQuantosMeses() {
        return gravidaQuantosMeses;
    }

    public void setGravidaQuantosMeses(BigDecimal gravidaQuantosMeses) {
        this.gravidaQuantosMeses = gravidaQuantosMeses;
    }

    public Boolean getAnemia() {
        return anemia;
    }

    public void setAnemia(Boolean anemia) {
        this.anemia = anemia;
    }

    public Boolean getPressaoArterialProblema() {
        return pressaoArterialProblema;
    }

    public void setPressaoArterialProblema(Boolean pressaoArterialProblema) {
        this.pressaoArterialProblema = pressaoArterialProblema;
    }

    public String getAnestesiaProblema() {
        return anestesiaProblema;
    }

    public void setAnestesiaProblema(String anestesiaProblema) {
        this.anestesiaProblema = anestesiaProblema;
    }

    public Boolean getHemorragiaExtracaoDentes() {
        return hemorragiaExtracaoDentes;
    }

    public void setHemorragiaExtracaoDentes(Boolean hemorragiaExtracaoDentes) {
        this.hemorragiaExtracaoDentes = hemorragiaExtracaoDentes;
    }

    public Boolean getFuma() {
        return fuma;
    }

    public void setFuma(Boolean fuma) {
        this.fuma = fuma;
    }

    public Boolean getBebeAlcool() {
        return bebeAlcool;
    }

    public void setBebeAlcool(Boolean bebeAlcool) {
        this.bebeAlcool = bebeAlcool;
    }

    public String getTratamentoPsicologicoPsiquiatrico() {
        return tratamentoPsicologicoPsiquiatrico;
    }

    public void setTratamentoPsicologicoPsiquiatrico(String tratamentoPsicologicoPsiquiatrico) {
        this.tratamentoPsicologicoPsiquiatrico = tratamentoPsicologicoPsiquiatrico;
    }

    public Boolean getDoencaAutoImune() {
        return doencaAutoImune;
    }

    public void setDoencaAutoImune(Boolean doencaAutoImune) {
        this.doencaAutoImune = doencaAutoImune;
    }

    public String getTratamentoAnterior() {
        return tratamentoAnterior;
    }

    public void setTratamentoAnterior(String tratamentoAnterior) {
        this.tratamentoAnterior = tratamentoAnterior;
    }

    public Boolean getImplantesEletronicos() {
        return implantesEletronicos;
    }

    public void setImplantesEletronicos(Boolean implantesEletronicos) {
        this.implantesEletronicos = implantesEletronicos;
    }

    public String getTratamentoEsteticoAnterior() {
        return tratamentoEsteticoAnterior;
    }

    public void setTratamentoEsteticoAnterior(String tratamentoEsteticoAnterior) {
        this.tratamentoEsteticoAnterior = tratamentoEsteticoAnterior;
    }

    public String getBotox() {
        return botox;
    }

    public void setBotox(String botox) {
        this.botox = botox;
    }

    public String getPreenchimento() {
        return preenchimento;
    }

    public void setPreenchimento(String preenchimento) {
        this.preenchimento = preenchimento;
    }

    public Boolean getFiosSustentacao() {
        return fiosSustentacao;
    }

    public void setFiosSustentacao(Boolean fiosSustentacao) {
        this.fiosSustentacao = fiosSustentacao;
    }

    public Boolean getLiftCirurgico() {
        return liftCirurgico;
    }

    public void setLiftCirurgico(Boolean liftCirurgico) {
        this.liftCirurgico = liftCirurgico;
    }

    public Boolean getPeelingQuimico() {
        return peelingQuimico;
    }

    public void setPeelingQuimico(Boolean peelingQuimico) {
        this.peelingQuimico = peelingQuimico;
    }

    public Boolean getLaser() {
        return laser;
    }

    public void setLaser(Boolean laser) {
        this.laser = laser;
    }

    public Boolean getRoacutan() {
        return roacutan;
    }

    public void setRoacutan(Boolean roacutan) {
        this.roacutan = roacutan;
    }

    public Boolean getHidroquinona() {
        return hidroquinona;
    }

    public void setHidroquinona(Boolean hidroquinona) {
        this.hidroquinona = hidroquinona;
    }

    public String getOutroTratamentoEstetico() {
        return outroTratamentoEstetico;
    }

    public void setOutroTratamentoEstetico(String outroTratamentoEstetico) {
        this.outroTratamentoEstetico = outroTratamentoEstetico;
    }

    public String getUsoDermocosmeticos() {
        return usoDermocosmeticos;
    }

    public void setUsoDermocosmeticos(String usoDermocosmeticos) {
        this.usoDermocosmeticos = usoDermocosmeticos;
    }

    public Date getUltimaLimpezaPele() {
        return ultimaLimpezaPele;
    }

    public void setUltimaLimpezaPele(Date ultimaLimpezaPele) {
        this.ultimaLimpezaPele = ultimaLimpezaPele;
    }

    public Fototipo getFototipo() {
        return fototipo;
    }

    public void setFototipo(Fototipo fototipo) {
        this.fototipo = fototipo;
    }

    public TipoPele getTipoPele() {
        return tipoPele;
    }

    public void setTipoPele(TipoPele tipoPele) {
        this.tipoPele = tipoPele;
    }

    public Boolean getCravos() {
        return cravos;
    }

    public void setCravos(Boolean cravos) {
        this.cravos = cravos;
    }

    public Boolean getAcne() {
        return acne;
    }

    public void setAcne(Boolean acne) {
        this.acne = acne;
    }

    public Boolean getMillion() {
        return million;
    }

    public void setMillion(Boolean million) {
        this.million = million;
    }

    public Boolean getFlacidezMuscular() {
        return flacidezMuscular;
    }

    public void setFlacidezMuscular(Boolean flacidezMuscular) {
        this.flacidezMuscular = flacidezMuscular;
    }

    public Boolean getFlacidezTissular() {
        return flacidezTissular;
    }

    public void setFlacidezTissular(Boolean flacidezTissular) {
        this.flacidezTissular = flacidezTissular;
    }

    public String getCicatriz() {
        return cicatriz;
    }

    public void setCicatriz(String cicatriz) {
        this.cicatriz = cicatriz;
    }

    public String getMancha() {
        return mancha;
    }

    public void setMancha(String mancha) {
        this.mancha = mancha;
    }

    public String getExpectativasTratamento() {
        return expectativasTratamento;
    }

    public void setExpectativasTratamento(String expectativasTratamento) {
        this.expectativasTratamento = expectativasTratamento;
    }

    public String getObservacoesRelevantes() {
        return observacoesRelevantes;
    }

    public void setObservacoesRelevantes(String observacoesRelevantes) {
        this.observacoesRelevantes = observacoesRelevantes;
    }

    public String getFotosAntesDepois() {
        return fotosAntesDepois;
    }

    public void setFotosAntesDepois(String fotosAntesDepois) {
        this.fotosAntesDepois = fotosAntesDepois;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetFacialTreatmentDTO that = (GetFacialTreatmentDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(problemaSaude, that.problemaSaude) && Objects.equals(tratamentoMedico, that.tratamentoMedico) && Objects.equals(usoMedicamento, that.usoMedicamento) && Objects.equals(usoHormonioErva, that.usoHormonioErva) && Objects.equals(usoAntidepressivo, that.usoAntidepressivo) && Objects.equals(usoAnticoncepcionalDiu, that.usoAnticoncepcionalDiu) && Objects.equals(usoDrogasEndovenosas, that.usoDrogasEndovenosas) && Objects.equals(alergiaMedicamento, that.alergiaMedicamento) && Objects.equals(usoAntibiotico, that.usoAntibiotico) && Objects.equals(problemaCoracao, that.problemaCoracao) && Objects.equals(doencaRins, that.doencaRins) && Objects.equals(problemaTireoide, that.problemaTireoide) && Objects.equals(doencaFigado, that.doencaFigado) && Objects.equals(bronquiteAsma, that.bronquiteAsma) && Objects.equals(tuberculose, that.tuberculose) && Objects.equals(febreFrequente, that.febreFrequente) && Objects.equals(diabetesTipo, that.diabetesTipo) && Objects.equals(epilepsiaConvulsoes, that.epilepsiaConvulsoes) && Objects.equals(reumatismoFebreReumatica, that.reumatismoFebreReumatica) && Objects.equals(gravidaQuantosMeses, that.gravidaQuantosMeses) && Objects.equals(anemia, that.anemia) && Objects.equals(pressaoArterialProblema, that.pressaoArterialProblema) && Objects.equals(anestesiaProblema, that.anestesiaProblema) && Objects.equals(hemorragiaExtracaoDentes, that.hemorragiaExtracaoDentes) && Objects.equals(fuma, that.fuma) && Objects.equals(bebeAlcool, that.bebeAlcool) && Objects.equals(tratamentoPsicologicoPsiquiatrico, that.tratamentoPsicologicoPsiquiatrico) && Objects.equals(doencaAutoImune, that.doencaAutoImune) && Objects.equals(tratamentoAnterior, that.tratamentoAnterior) && Objects.equals(implantesEletronicos, that.implantesEletronicos) && Objects.equals(tratamentoEsteticoAnterior, that.tratamentoEsteticoAnterior) && Objects.equals(botox, that.botox) && Objects.equals(preenchimento, that.preenchimento) && Objects.equals(fiosSustentacao, that.fiosSustentacao) && Objects.equals(liftCirurgico, that.liftCirurgico) && Objects.equals(peelingQuimico, that.peelingQuimico) && Objects.equals(laser, that.laser) && Objects.equals(roacutan, that.roacutan) && Objects.equals(hidroquinona, that.hidroquinona) && Objects.equals(outroTratamentoEstetico, that.outroTratamentoEstetico) && Objects.equals(usoDermocosmeticos, that.usoDermocosmeticos) && Objects.equals(ultimaLimpezaPele, that.ultimaLimpezaPele) && fototipo == that.fototipo && tipoPele == that.tipoPele && Objects.equals(cravos, that.cravos) && Objects.equals(acne, that.acne) && Objects.equals(million, that.million) && Objects.equals(flacidezMuscular, that.flacidezMuscular) && Objects.equals(flacidezTissular, that.flacidezTissular) && Objects.equals(cicatriz, that.cicatriz) && Objects.equals(mancha, that.mancha) && Objects.equals(expectativasTratamento, that.expectativasTratamento) && Objects.equals(observacoesRelevantes, that.observacoesRelevantes) && Objects.equals(fotosAntesDepois, that.fotosAntesDepois);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, problemaSaude, tratamentoMedico, usoMedicamento, usoHormonioErva, usoAntidepressivo, usoAnticoncepcionalDiu, usoDrogasEndovenosas, alergiaMedicamento, usoAntibiotico, problemaCoracao, doencaRins, problemaTireoide, doencaFigado, bronquiteAsma, tuberculose, febreFrequente, diabetesTipo, epilepsiaConvulsoes, reumatismoFebreReumatica, gravidaQuantosMeses, anemia, pressaoArterialProblema, anestesiaProblema, hemorragiaExtracaoDentes, fuma, bebeAlcool, tratamentoPsicologicoPsiquiatrico, doencaAutoImune, tratamentoAnterior, implantesEletronicos, tratamentoEsteticoAnterior, botox, preenchimento, fiosSustentacao, liftCirurgico, peelingQuimico, laser, roacutan, hidroquinona, outroTratamentoEstetico, usoDermocosmeticos, ultimaLimpezaPele, fototipo, tipoPele, cravos, acne, million, flacidezMuscular, flacidezTissular, cicatriz, mancha, expectativasTratamento, observacoesRelevantes, fotosAntesDepois);
    }
}
