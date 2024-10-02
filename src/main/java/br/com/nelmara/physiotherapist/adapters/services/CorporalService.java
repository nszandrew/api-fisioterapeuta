package br.com.nelmara.physiotherapist.adapters.services;

import br.com.nelmara.physiotherapist.domain.treatment.types.corporal.dto.CorporalTreatmentDTO;

public interface CorporalService {

    CorporalTreatmentDTO addCorporal(CorporalTreatmentDTO data, Long id);
    CorporalTreatmentDTO updateCorporal(CorporalTreatmentDTO data, Long id);
    void delete(Long id);
}
