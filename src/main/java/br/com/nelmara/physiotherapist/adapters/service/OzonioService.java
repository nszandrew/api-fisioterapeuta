package br.com.nelmara.physiotherapist.adapters.service;

import br.com.nelmara.physiotherapist.domain.entities.treatment.types.ozonio.dto.OzonioTreatmentDTO;

public interface OzonioService {

    OzonioTreatmentDTO addOzonioTreatment(OzonioTreatmentDTO data, Long id);
}
