package br.com.nelmara.physiotherapist.adapters.service;

import br.com.nelmara.physiotherapist.domain.entities.treatment.types.corporal.dto.CorporalTreatmentDTO;

public interface CorporalService {

    CorporalTreatmentDTO addCorporal(CorporalTreatmentDTO data, Long id);

}
