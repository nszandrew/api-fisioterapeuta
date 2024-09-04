package br.com.nelmara.physiotherapist.adapters.service;

import br.com.nelmara.physiotherapist.domain.entities.treatment.dto.TreatmentDTO;
import br.com.nelmara.physiotherapist.domain.entities.treatment.dto.UpdateTreatmentDTO;

public interface TreatmentService {

    TreatmentDTO addTreatment(TreatmentDTO data, Long id);
    UpdateTreatmentDTO updateTreatment(UpdateTreatmentDTO data, Long id);

}
