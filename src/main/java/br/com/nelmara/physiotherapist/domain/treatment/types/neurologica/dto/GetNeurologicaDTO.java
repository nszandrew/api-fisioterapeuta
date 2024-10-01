package br.com.nelmara.physiotherapist.domain.treatment.types.neurologica.dto;

import java.io.Serializable;
import java.util.Objects;

public class GetNeurologicaDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String hmp;
    private String hma;
    private String padraoPostural;
    private String forcaMuscular;
    private String marcha;
    private String trocasPosturais;
    private String orientacoes;

    public GetNeurologicaDTO() {}

    public GetNeurologicaDTO(String hmp, String hma, String padraoPostural, String forcaMuscular, String marcha, String trocasPosturais, String orientacoes) {
        this.hmp = hmp;
        this.hma = hma;
        this.padraoPostural = padraoPostural;
        this.forcaMuscular = forcaMuscular;
        this.marcha = marcha;
        this.trocasPosturais = trocasPosturais;
        this.orientacoes = orientacoes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHmp() {
        return hmp;
    }

    public void setHmp(String hmp) {
        this.hmp = hmp;
    }

    public String getHma() {
        return hma;
    }

    public void setHma(String hma) {
        this.hma = hma;
    }

    public String getPadraoPostural() {
        return padraoPostural;
    }

    public void setPadraoPostural(String padraoPostural) {
        this.padraoPostural = padraoPostural;
    }

    public String getForcaMuscular() {
        return forcaMuscular;
    }

    public void setForcaMuscular(String forcaMuscular) {
        this.forcaMuscular = forcaMuscular;
    }

    public String getMarcha() {
        return marcha;
    }

    public void setMarcha(String marcha) {
        this.marcha = marcha;
    }

    public String getTrocasPosturais() {
        return trocasPosturais;
    }

    public void setTrocasPosturais(String trocasPosturais) {
        this.trocasPosturais = trocasPosturais;
    }

    public String getOrientacoes() {
        return orientacoes;
    }

    public void setOrientacoes(String orientacoes) {
        this.orientacoes = orientacoes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetNeurologicaDTO that = (GetNeurologicaDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(hmp, that.hmp) && Objects.equals(hma, that.hma) && Objects.equals(padraoPostural, that.padraoPostural) && Objects.equals(forcaMuscular, that.forcaMuscular) && Objects.equals(marcha, that.marcha) && Objects.equals(trocasPosturais, that.trocasPosturais) && Objects.equals(orientacoes, that.orientacoes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hmp, hma, padraoPostural, forcaMuscular, marcha, trocasPosturais, orientacoes);
    }
}
