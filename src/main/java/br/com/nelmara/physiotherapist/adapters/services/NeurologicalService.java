package br.com.nelmara.physiotherapist.adapters.services;

import br.com.nelmara.physiotherapist.domain.treatment.types.neurologica.dto.NeurologicalDTO;

public interface NeurologicalService {

    NeurologicalDTO addNeurologicalService(NeurologicalDTO neurological, Long id);
    NeurologicalDTO updateNeurologicalService(NeurologicalDTO neurological, Long id);
    void delete(Long id);
}
