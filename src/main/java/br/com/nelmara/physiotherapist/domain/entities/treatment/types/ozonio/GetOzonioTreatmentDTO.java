package br.com.nelmara.physiotherapist.domain.entities.treatment.types.ozonio;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class GetOzonioTreatmentDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String ingestaoAgua;
    private String eliminacoesFisiologicas;
    private String sonoRepouso;
    private String habitosToxicos;
    private Boolean posturaTrabalhoSentada;
    private BigDecimal horasSentada;
    private Boolean posturaTrabalhoEmPe;
    private BigDecimal horasEmPe;
    private String checkupMedico;
    private Boolean tratamentoOzonioAnterior;
    private Boolean hipertireoidismo;
    private String deficienciaG6pd;
    private Boolean iam;
    private BigDecimal anemiaHb;
    private BigDecimal anemiaHt;
    private Boolean hemocromatose;
    private BigDecimal ferroSerico;
    private Boolean trombocitopenia;
    private Boolean dm;
    private BigDecimal glicemia;
    private String dst;
    private String alergias;
    private String medicamentos;
    private String cirurgias;
    private String doencaAtual;
    private String enfermidadePregressa;
    private String queixaPrincipal;
    private Boolean gestante;
    private Boolean lactentes;
    private Boolean marcaPasso;
    private Boolean implanteCardiaco;
    private Boolean diu;
    private Boolean hipercolesterolemia;
    private Boolean historicoHepatiteDoencaHepatica;
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
    private Boolean usoAntiCoagulantes;
    private Boolean labirintite;
    private Boolean ostioporose;
    private Boolean enxaqueca;
    private Boolean erniaDeDisco;
    private Boolean pedrasNosRins;
    private String patologiaAtiva;
    private Boolean trombose;

    public GetOzonioTreatmentDTO() {}

    public GetOzonioTreatmentDTO(String ingestaoAgua, String eliminacoesFisiologicas, String sonoRepouso, String habitosToxicos, Boolean posturaTrabalhoSentada, BigDecimal horasSentada, Boolean posturaTrabalhoEmPe, BigDecimal horasEmPe, String checkupMedico, Boolean tratamentoOzonioAnterior, Boolean hipertireoidismo, String deficienciaG6pd, Boolean iam, BigDecimal anemiaHb, BigDecimal anemiaHt, Boolean hemocromatose, BigDecimal ferroSerico, Boolean trombocitopenia, Boolean dm, BigDecimal glicemia, String dst, String alergias, String medicamentos, String cirurgias, String doencaAtual, String enfermidadePregressa, String queixaPrincipal, Boolean gestante, Boolean lactentes, Boolean marcaPasso, Boolean implanteCardiaco, Boolean diu, Boolean hipercolesterolemia, Boolean historicoHepatiteDoencaHepatica, Boolean alteracoesSistemaImunologico, Boolean cancer, Boolean insuficienciaLenosaProfunda, Boolean quimioRadioterapia, Boolean posCirurgico, Boolean pinosProtesesMetalicas, Boolean problemasCardiacos, Boolean epilepsia, Boolean queloides, Boolean herpes, Boolean usoAntiCoagulantes, Boolean labirintite, Boolean ostioporose, Boolean enxaqueca, Boolean erniaDeDisco, Boolean pedrasNosRins, String patologiaAtiva, Boolean trombose) {
        this.ingestaoAgua = ingestaoAgua;
        this.eliminacoesFisiologicas = eliminacoesFisiologicas;
        this.sonoRepouso = sonoRepouso;
        this.habitosToxicos = habitosToxicos;
        this.posturaTrabalhoSentada = posturaTrabalhoSentada;
        this.horasSentada = horasSentada;
        this.posturaTrabalhoEmPe = posturaTrabalhoEmPe;
        this.horasEmPe = horasEmPe;
        this.checkupMedico = checkupMedico;
        this.tratamentoOzonioAnterior = tratamentoOzonioAnterior;
        this.hipertireoidismo = hipertireoidismo;
        this.deficienciaG6pd = deficienciaG6pd;
        this.iam = iam;
        this.anemiaHb = anemiaHb;
        this.anemiaHt = anemiaHt;
        this.hemocromatose = hemocromatose;
        this.ferroSerico = ferroSerico;
        this.trombocitopenia = trombocitopenia;
        this.dm = dm;
        this.glicemia = glicemia;
        this.dst = dst;
        this.alergias = alergias;
        this.medicamentos = medicamentos;
        this.cirurgias = cirurgias;
        this.doencaAtual = doencaAtual;
        this.enfermidadePregressa = enfermidadePregressa;
        this.queixaPrincipal = queixaPrincipal;
        this.gestante = gestante;
        this.lactentes = lactentes;
        this.marcaPasso = marcaPasso;
        this.implanteCardiaco = implanteCardiaco;
        this.diu = diu;
        this.hipercolesterolemia = hipercolesterolemia;
        this.historicoHepatiteDoencaHepatica = historicoHepatiteDoencaHepatica;
        this.alteracoesSistemaImunologico = alteracoesSistemaImunologico;
        this.cancer = cancer;
        this.insuficienciaLenosaProfunda = insuficienciaLenosaProfunda;
        this.quimioRadioterapia = quimioRadioterapia;
        this.posCirurgico = posCirurgico;
        this.pinosProtesesMetalicas = pinosProtesesMetalicas;
        this.problemasCardiacos = problemasCardiacos;
        this.epilepsia = epilepsia;
        this.queloides = queloides;
        this.herpes = herpes;
        this.usoAntiCoagulantes = usoAntiCoagulantes;
        this.labirintite = labirintite;
        this.ostioporose = ostioporose;
        this.enxaqueca = enxaqueca;
        this.erniaDeDisco = erniaDeDisco;
        this.pedrasNosRins = pedrasNosRins;
        this.patologiaAtiva = patologiaAtiva;
        this.trombose = trombose;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIngestaoAgua() {
        return ingestaoAgua;
    }

    public void setIngestaoAgua(String ingestaoAgua) {
        this.ingestaoAgua = ingestaoAgua;
    }

    public String getEliminacoesFisiologicas() {
        return eliminacoesFisiologicas;
    }

    public void setEliminacoesFisiologicas(String eliminacoesFisiologicas) {
        this.eliminacoesFisiologicas = eliminacoesFisiologicas;
    }

    public String getSonoRepouso() {
        return sonoRepouso;
    }

    public void setSonoRepouso(String sonoRepouso) {
        this.sonoRepouso = sonoRepouso;
    }

    public String getHabitosToxicos() {
        return habitosToxicos;
    }

    public void setHabitosToxicos(String habitosToxicos) {
        this.habitosToxicos = habitosToxicos;
    }

    public Boolean getPosturaTrabalhoSentada() {
        return posturaTrabalhoSentada;
    }

    public void setPosturaTrabalhoSentada(Boolean posturaTrabalhoSentada) {
        this.posturaTrabalhoSentada = posturaTrabalhoSentada;
    }

    public BigDecimal getHorasSentada() {
        return horasSentada;
    }

    public void setHorasSentada(BigDecimal horasSentada) {
        this.horasSentada = horasSentada;
    }

    public Boolean getPosturaTrabalhoEmPe() {
        return posturaTrabalhoEmPe;
    }

    public void setPosturaTrabalhoEmPe(Boolean posturaTrabalhoEmPe) {
        this.posturaTrabalhoEmPe = posturaTrabalhoEmPe;
    }

    public BigDecimal getHorasEmPe() {
        return horasEmPe;
    }

    public void setHorasEmPe(BigDecimal horasEmPe) {
        this.horasEmPe = horasEmPe;
    }

    public String getCheckupMedico() {
        return checkupMedico;
    }

    public void setCheckupMedico(String checkupMedico) {
        this.checkupMedico = checkupMedico;
    }

    public Boolean getTratamentoOzonioAnterior() {
        return tratamentoOzonioAnterior;
    }

    public void setTratamentoOzonioAnterior(Boolean tratamentoOzonioAnterior) {
        this.tratamentoOzonioAnterior = tratamentoOzonioAnterior;
    }

    public Boolean getHipertireoidismo() {
        return hipertireoidismo;
    }

    public void setHipertireoidismo(Boolean hipertireoidismo) {
        this.hipertireoidismo = hipertireoidismo;
    }

    public String getDeficienciaG6pd() {
        return deficienciaG6pd;
    }

    public void setDeficienciaG6pd(String deficienciaG6pd) {
        this.deficienciaG6pd = deficienciaG6pd;
    }

    public Boolean getIam() {
        return iam;
    }

    public void setIam(Boolean iam) {
        this.iam = iam;
    }

    public BigDecimal getAnemiaHb() {
        return anemiaHb;
    }

    public void setAnemiaHb(BigDecimal anemiaHb) {
        this.anemiaHb = anemiaHb;
    }

    public BigDecimal getAnemiaHt() {
        return anemiaHt;
    }

    public void setAnemiaHt(BigDecimal anemiaHt) {
        this.anemiaHt = anemiaHt;
    }

    public Boolean getHemocromatose() {
        return hemocromatose;
    }

    public void setHemocromatose(Boolean hemocromatose) {
        this.hemocromatose = hemocromatose;
    }

    public BigDecimal getFerroSerico() {
        return ferroSerico;
    }

    public void setFerroSerico(BigDecimal ferroSerico) {
        this.ferroSerico = ferroSerico;
    }

    public Boolean getTrombocitopenia() {
        return trombocitopenia;
    }

    public void setTrombocitopenia(Boolean trombocitopenia) {
        this.trombocitopenia = trombocitopenia;
    }

    public Boolean getDm() {
        return dm;
    }

    public void setDm(Boolean dm) {
        this.dm = dm;
    }

    public BigDecimal getGlicemia() {
        return glicemia;
    }

    public void setGlicemia(BigDecimal glicemia) {
        this.glicemia = glicemia;
    }

    public String getDst() {
        return dst;
    }

    public void setDst(String dst) {
        this.dst = dst;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getCirurgias() {
        return cirurgias;
    }

    public void setCirurgias(String cirurgias) {
        this.cirurgias = cirurgias;
    }

    public String getDoencaAtual() {
        return doencaAtual;
    }

    public void setDoencaAtual(String doencaAtual) {
        this.doencaAtual = doencaAtual;
    }

    public String getEnfermidadePregressa() {
        return enfermidadePregressa;
    }

    public void setEnfermidadePregressa(String enfermidadePregressa) {
        this.enfermidadePregressa = enfermidadePregressa;
    }

    public String getQueixaPrincipal() {
        return queixaPrincipal;
    }

    public void setQueixaPrincipal(String queixaPrincipal) {
        this.queixaPrincipal = queixaPrincipal;
    }

    public Boolean getGestante() {
        return gestante;
    }

    public void setGestante(Boolean gestante) {
        this.gestante = gestante;
    }

    public Boolean getLactentes() {
        return lactentes;
    }

    public void setLactentes(Boolean lactentes) {
        this.lactentes = lactentes;
    }

    public Boolean getMarcaPasso() {
        return marcaPasso;
    }

    public void setMarcaPasso(Boolean marcaPasso) {
        this.marcaPasso = marcaPasso;
    }

    public Boolean getImplanteCardiaco() {
        return implanteCardiaco;
    }

    public void setImplanteCardiaco(Boolean implanteCardiaco) {
        this.implanteCardiaco = implanteCardiaco;
    }

    public Boolean getDiu() {
        return diu;
    }

    public void setDiu(Boolean diu) {
        this.diu = diu;
    }

    public Boolean getHipercolesterolemia() {
        return hipercolesterolemia;
    }

    public void setHipercolesterolemia(Boolean hipercolesterolemia) {
        this.hipercolesterolemia = hipercolesterolemia;
    }

    public Boolean getHistoricoHepatiteDoencaHepatica() {
        return historicoHepatiteDoencaHepatica;
    }

    public void setHistoricoHepatiteDoencaHepatica(Boolean historicoHepatiteDoencaHepatica) {
        this.historicoHepatiteDoencaHepatica = historicoHepatiteDoencaHepatica;
    }

    public Boolean getAlteracoesSistemaImunologico() {
        return alteracoesSistemaImunologico;
    }

    public void setAlteracoesSistemaImunologico(Boolean alteracoesSistemaImunologico) {
        this.alteracoesSistemaImunologico = alteracoesSistemaImunologico;
    }

    public Boolean getCancer() {
        return cancer;
    }

    public void setCancer(Boolean cancer) {
        this.cancer = cancer;
    }

    public Boolean getInsuficienciaLenosaProfunda() {
        return insuficienciaLenosaProfunda;
    }

    public void setInsuficienciaLenosaProfunda(Boolean insuficienciaLenosaProfunda) {
        this.insuficienciaLenosaProfunda = insuficienciaLenosaProfunda;
    }

    public Boolean getQuimioRadioterapia() {
        return quimioRadioterapia;
    }

    public void setQuimioRadioterapia(Boolean quimioRadioterapia) {
        this.quimioRadioterapia = quimioRadioterapia;
    }

    public Boolean getPosCirurgico() {
        return posCirurgico;
    }

    public void setPosCirurgico(Boolean posCirurgico) {
        this.posCirurgico = posCirurgico;
    }

    public Boolean getPinosProtesesMetalicas() {
        return pinosProtesesMetalicas;
    }

    public void setPinosProtesesMetalicas(Boolean pinosProtesesMetalicas) {
        this.pinosProtesesMetalicas = pinosProtesesMetalicas;
    }

    public Boolean getProblemasCardiacos() {
        return problemasCardiacos;
    }

    public void setProblemasCardiacos(Boolean problemasCardiacos) {
        this.problemasCardiacos = problemasCardiacos;
    }

    public Boolean getEpilepsia() {
        return epilepsia;
    }

    public void setEpilepsia(Boolean epilepsia) {
        this.epilepsia = epilepsia;
    }

    public Boolean getQueloides() {
        return queloides;
    }

    public void setQueloides(Boolean queloides) {
        this.queloides = queloides;
    }

    public Boolean getHerpes() {
        return herpes;
    }

    public void setHerpes(Boolean herpes) {
        this.herpes = herpes;
    }

    public Boolean getUsoAntiCoagulantes() {
        return usoAntiCoagulantes;
    }

    public void setUsoAntiCoagulantes(Boolean usoAntiCoagulantes) {
        this.usoAntiCoagulantes = usoAntiCoagulantes;
    }

    public Boolean getLabirintite() {
        return labirintite;
    }

    public void setLabirintite(Boolean labirintite) {
        this.labirintite = labirintite;
    }

    public Boolean getOstioporose() {
        return ostioporose;
    }

    public void setOstioporose(Boolean ostioporose) {
        this.ostioporose = ostioporose;
    }

    public Boolean getEnxaqueca() {
        return enxaqueca;
    }

    public void setEnxaqueca(Boolean enxaqueca) {
        this.enxaqueca = enxaqueca;
    }

    public Boolean getErniaDeDisco() {
        return erniaDeDisco;
    }

    public void setErniaDeDisco(Boolean erniaDeDisco) {
        this.erniaDeDisco = erniaDeDisco;
    }

    public Boolean getPedrasNosRins() {
        return pedrasNosRins;
    }

    public void setPedrasNosRins(Boolean pedrasNosRins) {
        this.pedrasNosRins = pedrasNosRins;
    }

    public String getPatologiaAtiva() {
        return patologiaAtiva;
    }

    public void setPatologiaAtiva(String patologiaAtiva) {
        this.patologiaAtiva = patologiaAtiva;
    }

    public Boolean getTrombose() {
        return trombose;
    }

    public void setTrombose(Boolean trombose) {
        this.trombose = trombose;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetOzonioTreatmentDTO that = (GetOzonioTreatmentDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(ingestaoAgua, that.ingestaoAgua) && Objects.equals(eliminacoesFisiologicas, that.eliminacoesFisiologicas) && Objects.equals(sonoRepouso, that.sonoRepouso) && Objects.equals(habitosToxicos, that.habitosToxicos) && Objects.equals(posturaTrabalhoSentada, that.posturaTrabalhoSentada) && Objects.equals(horasSentada, that.horasSentada) && Objects.equals(posturaTrabalhoEmPe, that.posturaTrabalhoEmPe) && Objects.equals(horasEmPe, that.horasEmPe) && Objects.equals(checkupMedico, that.checkupMedico) && Objects.equals(tratamentoOzonioAnterior, that.tratamentoOzonioAnterior) && Objects.equals(hipertireoidismo, that.hipertireoidismo) && Objects.equals(deficienciaG6pd, that.deficienciaG6pd) && Objects.equals(iam, that.iam) && Objects.equals(anemiaHb, that.anemiaHb) && Objects.equals(anemiaHt, that.anemiaHt) && Objects.equals(hemocromatose, that.hemocromatose) && Objects.equals(ferroSerico, that.ferroSerico) && Objects.equals(trombocitopenia, that.trombocitopenia) && Objects.equals(dm, that.dm) && Objects.equals(glicemia, that.glicemia) && Objects.equals(dst, that.dst) && Objects.equals(alergias, that.alergias) && Objects.equals(medicamentos, that.medicamentos) && Objects.equals(cirurgias, that.cirurgias) && Objects.equals(doencaAtual, that.doencaAtual) && Objects.equals(enfermidadePregressa, that.enfermidadePregressa) && Objects.equals(queixaPrincipal, that.queixaPrincipal) && Objects.equals(gestante, that.gestante) && Objects.equals(lactentes, that.lactentes) && Objects.equals(marcaPasso, that.marcaPasso) && Objects.equals(implanteCardiaco, that.implanteCardiaco) && Objects.equals(diu, that.diu) && Objects.equals(hipercolesterolemia, that.hipercolesterolemia) && Objects.equals(historicoHepatiteDoencaHepatica, that.historicoHepatiteDoencaHepatica) && Objects.equals(alteracoesSistemaImunologico, that.alteracoesSistemaImunologico) && Objects.equals(cancer, that.cancer) && Objects.equals(insuficienciaLenosaProfunda, that.insuficienciaLenosaProfunda) && Objects.equals(quimioRadioterapia, that.quimioRadioterapia) && Objects.equals(posCirurgico, that.posCirurgico) && Objects.equals(pinosProtesesMetalicas, that.pinosProtesesMetalicas) && Objects.equals(problemasCardiacos, that.problemasCardiacos) && Objects.equals(epilepsia, that.epilepsia) && Objects.equals(queloides, that.queloides) && Objects.equals(herpes, that.herpes) && Objects.equals(usoAntiCoagulantes, that.usoAntiCoagulantes) && Objects.equals(labirintite, that.labirintite) && Objects.equals(ostioporose, that.ostioporose) && Objects.equals(enxaqueca, that.enxaqueca) && Objects.equals(erniaDeDisco, that.erniaDeDisco) && Objects.equals(pedrasNosRins, that.pedrasNosRins) && Objects.equals(patologiaAtiva, that.patologiaAtiva) && Objects.equals(trombose, that.trombose);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ingestaoAgua, eliminacoesFisiologicas, sonoRepouso, habitosToxicos, posturaTrabalhoSentada, horasSentada, posturaTrabalhoEmPe, horasEmPe, checkupMedico, tratamentoOzonioAnterior, hipertireoidismo, deficienciaG6pd, iam, anemiaHb, anemiaHt, hemocromatose, ferroSerico, trombocitopenia, dm, glicemia, dst, alergias, medicamentos, cirurgias, doencaAtual, enfermidadePregressa, queixaPrincipal, gestante, lactentes, marcaPasso, implanteCardiaco, diu, hipercolesterolemia, historicoHepatiteDoencaHepatica, alteracoesSistemaImunologico, cancer, insuficienciaLenosaProfunda, quimioRadioterapia, posCirurgico, pinosProtesesMetalicas, problemasCardiacos, epilepsia, queloides, herpes, usoAntiCoagulantes, labirintite, ostioporose, enxaqueca, erniaDeDisco, pedrasNosRins, patologiaAtiva, trombose);
    }
}
