package br.com.nelmara.physiotherapist.adapters.service;

import br.com.nelmara.physiotherapist.domain.entities.treatment.types.neurologica.dto.NeurologicalDTO;

public interface NeurologicalService {

    NeurologicalDTO addNeurologicalService(NeurologicalDTO neurological, Long id);
}
