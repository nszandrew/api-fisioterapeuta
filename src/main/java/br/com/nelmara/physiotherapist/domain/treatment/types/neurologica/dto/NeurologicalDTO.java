package br.com.nelmara.physiotherapist.domain.treatment.types.neurologica.dto;

import jakarta.persistence.Column;

public record NeurologicalDTO(
                              String hmp,
                              String hma,
                              @Column(name = "padrao_postural")
                              String padraoPostural,
                              @Column(name = "forca_muscular")
                              String forcaMuscular,
                              String marcha,
                              @Column(name = "trocas_posturais")
                              String trocasPosturais,
                              String orientacoes) {
}
