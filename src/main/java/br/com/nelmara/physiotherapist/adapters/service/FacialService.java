package br.com.nelmara.physiotherapist.adapters.service;

import br.com.nelmara.physiotherapist.domain.entities.treatment.types.facial.dto.FacialTreatmentDTO;
import org.springframework.stereotype.Service;

@Service
public interface FacialService {

    FacialTreatmentDTO addFacialTreatment(FacialTreatmentDTO data, Long id);
}
