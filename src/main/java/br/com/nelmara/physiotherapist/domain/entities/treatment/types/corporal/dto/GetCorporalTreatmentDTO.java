package br.com.nelmara.physiotherapist.domain.entities.treatment.types.corporal.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class GetCorporalTreatmentDTO implements Serializable {

    private static final long serialVersionUID = 1L;

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

    public GetCorporalTreatmentDTO() {}

    public GetCorporalTreatmentDTO(String maiorDesconforto, String tempoDesconforto, String tratamento, String etilismo, String tabagismo, String atividadeFisica, String acompanhamentoNutricional, BigDecimal altura, BigDecimal pesoAtual, String ingestaoAgua, String dataUltimaMenstruacao, String acompanhamentoMedico, String cirurgia, String usoMedicamento, String medicamentoEmagrecer, String bulimia, String historicoDoencaFamiliar, String retencaoLiquido, String gorduraLocalizada, String feg, String flacidezTissular, String flacidezMuscular, String estria, String mama, BigDecimal cintura, BigDecimal abdomenUmbigo, BigDecimal abdomenSuperior, BigDecimal abdomenInferior, BigDecimal flancos, BigDecimal quadril, BigDecimal culote, BigDecimal coxa, BigDecimal joelho, BigDecimal panturrilha, BigDecimal braco, Boolean gestante, Boolean lactentes, Boolean marcaPasso, Boolean implanteCardiaco, Boolean diu, Boolean hipercolesterolemia, Boolean historicoHepatite, Boolean alteracoesSistemaImunologico, Boolean cancer, Boolean insuficienciaLenosaProfunda, Boolean quimioRadioterapia, Boolean posCirurgico, Boolean pinosProtesesMetalicas, Boolean problemasCardiacos, Boolean epilepsia, Boolean queloides, Boolean herpes, Boolean usoAnticoagulantes, Boolean labirintite, Boolean osteoporose, Boolean enxaqueca, Boolean herniaDisco, Boolean pedrasRins, Boolean patologiaAtiva, Boolean trombose) {
        this.maiorDesconforto = maiorDesconforto;
        this.tempoDesconforto = tempoDesconforto;
        this.tratamento = tratamento;
        this.etilismo = etilismo;
        this.tabagismo = tabagismo;
        this.atividadeFisica = atividadeFisica;
        this.acompanhamentoNutricional = acompanhamentoNutricional;
        this.altura = altura;
        this.pesoAtual = pesoAtual;
        this.ingestaoAgua = ingestaoAgua;
        this.dataUltimaMenstruacao = dataUltimaMenstruacao;
        this.acompanhamentoMedico = acompanhamentoMedico;
        this.cirurgia = cirurgia;
        this.usoMedicamento = usoMedicamento;
        this.medicamentoEmagrecer = medicamentoEmagrecer;
        this.bulimia = bulimia;
        this.historicoDoencaFamiliar = historicoDoencaFamiliar;
        this.retencaoLiquido = retencaoLiquido;
        this.gorduraLocalizada = gorduraLocalizada;
        this.feg = feg;
        this.flacidezTissular = flacidezTissular;
        this.flacidezMuscular = flacidezMuscular;
        this.estria = estria;
        this.mama = mama;
        this.cintura = cintura;
        this.abdomenUmbigo = abdomenUmbigo;
        this.abdomenSuperior = abdomenSuperior;
        this.abdomenInferior = abdomenInferior;
        this.flancos = flancos;
        this.quadril = quadril;
        this.culote = culote;
        this.coxa = coxa;
        this.joelho = joelho;
        this.panturrilha = panturrilha;
        this.braco = braco;
        this.gestante = gestante;
        this.lactentes = lactentes;
        this.marcaPasso = marcaPasso;
        this.implanteCardiaco = implanteCardiaco;
        this.diu = diu;
        this.hipercolesterolemia = hipercolesterolemia;
        this.historicoHepatite = historicoHepatite;
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
        this.usoAnticoagulantes = usoAnticoagulantes;
        this.labirintite = labirintite;
        this.osteoporose = osteoporose;
        this.enxaqueca = enxaqueca;
        this.herniaDisco = herniaDisco;
        this.pedrasRins = pedrasRins;
        this.patologiaAtiva = patologiaAtiva;
        this.trombose = trombose;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaiorDesconforto() {
        return maiorDesconforto;
    }

    public void setMaiorDesconforto(String maiorDesconforto) {
        this.maiorDesconforto = maiorDesconforto;
    }

    public String getTempoDesconforto() {
        return tempoDesconforto;
    }

    public void setTempoDesconforto(String tempoDesconforto) {
        this.tempoDesconforto = tempoDesconforto;
    }

    public String getTratamento() {
        return tratamento;
    }

    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }

    public String getEtilismo() {
        return etilismo;
    }

    public void setEtilismo(String etilismo) {
        this.etilismo = etilismo;
    }

    public String getTabagismo() {
        return tabagismo;
    }

    public void setTabagismo(String tabagismo) {
        this.tabagismo = tabagismo;
    }

    public String getAtividadeFisica() {
        return atividadeFisica;
    }

    public void setAtividadeFisica(String atividadeFisica) {
        this.atividadeFisica = atividadeFisica;
    }

    public String getAcompanhamentoNutricional() {
        return acompanhamentoNutricional;
    }

    public void setAcompanhamentoNutricional(String acompanhamentoNutricional) {
        this.acompanhamentoNutricional = acompanhamentoNutricional;
    }

    public BigDecimal getAltura() {
        return altura;
    }

    public void setAltura(BigDecimal altura) {
        this.altura = altura;
    }

    public BigDecimal getPesoAtual() {
        return pesoAtual;
    }

    public void setPesoAtual(BigDecimal pesoAtual) {
        this.pesoAtual = pesoAtual;
    }

    public String getIngestaoAgua() {
        return ingestaoAgua;
    }

    public void setIngestaoAgua(String ingestaoAgua) {
        this.ingestaoAgua = ingestaoAgua;
    }

    public String getDataUltimaMestruacao() {
        return dataUltimaMenstruacao;
    }

    public void setDataUltimaMenstruacao(String dataUltimaMenstruacao) {
        this.dataUltimaMenstruacao = dataUltimaMenstruacao;
    }

    public String getAcompanhamentoMedico() {
        return acompanhamentoMedico;
    }

    public void setAcompanhamentoMedico(String acompanhamentoMedico) {
        this.acompanhamentoMedico = acompanhamentoMedico;
    }

    public String getCirurgia() {
        return cirurgia;
    }

    public void setCirurgia(String cirurgia) {
        this.cirurgia = cirurgia;
    }

    public String getUsoMedicamento() {
        return usoMedicamento;
    }

    public void setUsoMedicamento(String usoMedicamento) {
        this.usoMedicamento = usoMedicamento;
    }

    public String getMedicamentoEmagrecer() {
        return medicamentoEmagrecer;
    }

    public void setMedicamentoEmagrecer(String medicamentoEmagrecer) {
        this.medicamentoEmagrecer = medicamentoEmagrecer;
    }

    public String getBulimia() {
        return bulimia;
    }

    public void setBulimia(String bulimia) {
        this.bulimia = bulimia;
    }

    public String getHistoricoDoencaFamiliar() {
        return historicoDoencaFamiliar;
    }

    public void setHistoricoDoencaFamiliar(String historicoDoencaFamiliar) {
        this.historicoDoencaFamiliar = historicoDoencaFamiliar;
    }

    public String getRetencaoLiquido() {
        return retencaoLiquido;
    }

    public void setRetencaoLiquido(String retencaoLiquido) {
        this.retencaoLiquido = retencaoLiquido;
    }

    public String getGorduraLocalizada() {
        return gorduraLocalizada;
    }

    public void setGorduraLocalizada(String gorduraLocalizada) {
        this.gorduraLocalizada = gorduraLocalizada;
    }

    public String getFeg() {
        return feg;
    }

    public void setFeg(String feg) {
        this.feg = feg;
    }

    public String getFlacidezTissular() {
        return flacidezTissular;
    }

    public void setFlacidezTissular(String flacidezTissular) {
        this.flacidezTissular = flacidezTissular;
    }

    public String getFlacidezMuscular() {
        return flacidezMuscular;
    }

    public void setFlacidezMuscular(String flacidezMuscular) {
        this.flacidezMuscular = flacidezMuscular;
    }

    public String getEstria() {
        return estria;
    }

    public void setEstria(String estria) {
        this.estria = estria;
    }

    public String getMama() {
        return mama;
    }

    public void setMama(String mama) {
        this.mama = mama;
    }

    public BigDecimal getCintura() {
        return cintura;
    }

    public void setCintura(BigDecimal cintura) {
        this.cintura = cintura;
    }

    public BigDecimal getAbdomenUmbigo() {
        return abdomenUmbigo;
    }

    public void setAbdomenUmbigo(BigDecimal abdomenUmbigo) {
        this.abdomenUmbigo = abdomenUmbigo;
    }

    public BigDecimal getAbdomenSuperior() {
        return abdomenSuperior;
    }

    public void setAbdomenSuperior(BigDecimal abdomenSuperior) {
        this.abdomenSuperior = abdomenSuperior;
    }

    public BigDecimal getAbdomenInferior() {
        return abdomenInferior;
    }

    public void setAbdomenInferior(BigDecimal abdomenInferior) {
        this.abdomenInferior = abdomenInferior;
    }

    public BigDecimal getFlancos() {
        return flancos;
    }

    public void setFlancos(BigDecimal flancos) {
        this.flancos = flancos;
    }

    public BigDecimal getQuadril() {
        return quadril;
    }

    public void setQuadril(BigDecimal quadril) {
        this.quadril = quadril;
    }

    public BigDecimal getCulote() {
        return culote;
    }

    public void setCulote(BigDecimal culote) {
        this.culote = culote;
    }

    public BigDecimal getCoxa() {
        return coxa;
    }

    public void setCoxa(BigDecimal coxa) {
        this.coxa = coxa;
    }

    public BigDecimal getJoelho() {
        return joelho;
    }

    public void setJoelho(BigDecimal joelho) {
        this.joelho = joelho;
    }

    public BigDecimal getPanturrilha() {
        return panturrilha;
    }

    public void setPanturrilha(BigDecimal panturrilha) {
        this.panturrilha = panturrilha;
    }

    public BigDecimal getBraco() {
        return braco;
    }

    public void setBraco(BigDecimal braco) {
        this.braco = braco;
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

    public Boolean getHistoricoHepatite() {
        return historicoHepatite;
    }

    public void setHistoricoHepatite(Boolean historicoHepatite) {
        this.historicoHepatite = historicoHepatite;
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

    public Boolean getUsoAnticoagulantes() {
        return usoAnticoagulantes;
    }

    public void setUsoAnticoagulantes(Boolean usoAnticoagulantes) {
        this.usoAnticoagulantes = usoAnticoagulantes;
    }

    public Boolean getLabirintite() {
        return labirintite;
    }

    public void setLabirintite(Boolean labirintite) {
        this.labirintite = labirintite;
    }

    public Boolean getOsteoporose() {
        return osteoporose;
    }

    public void setOsteoporose(Boolean osteoporose) {
        this.osteoporose = osteoporose;
    }

    public Boolean getEnxaqueca() {
        return enxaqueca;
    }

    public void setEnxaqueca(Boolean enxaqueca) {
        this.enxaqueca = enxaqueca;
    }

    public Boolean getHerniaDisco() {
        return herniaDisco;
    }

    public void setHerniaDisco(Boolean herniaDisco) {
        this.herniaDisco = herniaDisco;
    }

    public Boolean getPedrasRins() {
        return pedrasRins;
    }

    public void setPedrasRins(Boolean pedrasRins) {
        this.pedrasRins = pedrasRins;
    }

    public Boolean getPatologiaAtiva() {
        return patologiaAtiva;
    }

    public void setPatologiaAtiva(Boolean patologiaAtiva) {
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
        GetCorporalTreatmentDTO that = (GetCorporalTreatmentDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(maiorDesconforto, that.maiorDesconforto) && Objects.equals(tempoDesconforto, that.tempoDesconforto) && Objects.equals(tratamento, that.tratamento) && Objects.equals(etilismo, that.etilismo) && Objects.equals(tabagismo, that.tabagismo) && Objects.equals(atividadeFisica, that.atividadeFisica) && Objects.equals(acompanhamentoNutricional, that.acompanhamentoNutricional) && Objects.equals(altura, that.altura) && Objects.equals(pesoAtual, that.pesoAtual) && Objects.equals(ingestaoAgua, that.ingestaoAgua) && Objects.equals(dataUltimaMenstruacao, that.dataUltimaMenstruacao) && Objects.equals(acompanhamentoMedico, that.acompanhamentoMedico) && Objects.equals(cirurgia, that.cirurgia) && Objects.equals(usoMedicamento, that.usoMedicamento) && Objects.equals(medicamentoEmagrecer, that.medicamentoEmagrecer) && Objects.equals(bulimia, that.bulimia) && Objects.equals(historicoDoencaFamiliar, that.historicoDoencaFamiliar) && Objects.equals(retencaoLiquido, that.retencaoLiquido) && Objects.equals(gorduraLocalizada, that.gorduraLocalizada) && Objects.equals(feg, that.feg) && Objects.equals(flacidezTissular, that.flacidezTissular) && Objects.equals(flacidezMuscular, that.flacidezMuscular) && Objects.equals(estria, that.estria) && Objects.equals(mama, that.mama) && Objects.equals(cintura, that.cintura) && Objects.equals(abdomenUmbigo, that.abdomenUmbigo) && Objects.equals(abdomenSuperior, that.abdomenSuperior) && Objects.equals(abdomenInferior, that.abdomenInferior) && Objects.equals(flancos, that.flancos) && Objects.equals(quadril, that.quadril) && Objects.equals(culote, that.culote) && Objects.equals(coxa, that.coxa) && Objects.equals(joelho, that.joelho) && Objects.equals(panturrilha, that.panturrilha) && Objects.equals(braco, that.braco) && Objects.equals(gestante, that.gestante) && Objects.equals(lactentes, that.lactentes) && Objects.equals(marcaPasso, that.marcaPasso) && Objects.equals(implanteCardiaco, that.implanteCardiaco) && Objects.equals(diu, that.diu) && Objects.equals(hipercolesterolemia, that.hipercolesterolemia) && Objects.equals(historicoHepatite, that.historicoHepatite) && Objects.equals(alteracoesSistemaImunologico, that.alteracoesSistemaImunologico) && Objects.equals(cancer, that.cancer) && Objects.equals(insuficienciaLenosaProfunda, that.insuficienciaLenosaProfunda) && Objects.equals(quimioRadioterapia, that.quimioRadioterapia) && Objects.equals(posCirurgico, that.posCirurgico) && Objects.equals(pinosProtesesMetalicas, that.pinosProtesesMetalicas) && Objects.equals(problemasCardiacos, that.problemasCardiacos) && Objects.equals(epilepsia, that.epilepsia) && Objects.equals(queloides, that.queloides) && Objects.equals(herpes, that.herpes) && Objects.equals(usoAnticoagulantes, that.usoAnticoagulantes) && Objects.equals(labirintite, that.labirintite) && Objects.equals(osteoporose, that.osteoporose) && Objects.equals(enxaqueca, that.enxaqueca) && Objects.equals(herniaDisco, that.herniaDisco) && Objects.equals(pedrasRins, that.pedrasRins) && Objects.equals(patologiaAtiva, that.patologiaAtiva) && Objects.equals(trombose, that.trombose);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, maiorDesconforto, tempoDesconforto, tratamento, etilismo, tabagismo, atividadeFisica, acompanhamentoNutricional, altura, pesoAtual, ingestaoAgua, dataUltimaMenstruacao, acompanhamentoMedico, cirurgia, usoMedicamento, medicamentoEmagrecer, bulimia, historicoDoencaFamiliar, retencaoLiquido, gorduraLocalizada, feg, flacidezTissular, flacidezMuscular, estria, mama, cintura, abdomenUmbigo, abdomenSuperior, abdomenInferior, flancos, quadril, culote, coxa, joelho, panturrilha, braco, gestante, lactentes, marcaPasso, implanteCardiaco, diu, hipercolesterolemia, historicoHepatite, alteracoesSistemaImunologico, cancer, insuficienciaLenosaProfunda, quimioRadioterapia, posCirurgico, pinosProtesesMetalicas, problemasCardiacos, epilepsia, queloides, herpes, usoAnticoagulantes, labirintite, osteoporose, enxaqueca, herniaDisco, pedrasRins, patologiaAtiva, trombose);
    }
}
