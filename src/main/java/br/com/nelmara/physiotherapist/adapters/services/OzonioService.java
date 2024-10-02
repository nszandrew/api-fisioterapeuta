package br.com.nelmara.physiotherapist.adapters.services;

import br.com.nelmara.physiotherapist.domain.treatment.types.ozonio.dto.OzonioTreatmentDTO;

public interface OzonioService {

    OzonioTreatmentDTO addOzonioTreatment(OzonioTreatmentDTO data, Long id);
    OzonioTreatmentDTO updateOzonioTreatment(OzonioTreatmentDTO data, Long id);
    void delete(Long id);
}
