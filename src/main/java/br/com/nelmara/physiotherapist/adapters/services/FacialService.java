package br.com.nelmara.physiotherapist.adapters.services;

import br.com.nelmara.physiotherapist.domain.treatment.types.facial.dto.FacialTreatmentDTO;
import org.springframework.stereotype.Service;

@Service
public interface FacialService {

    FacialTreatmentDTO addFacialTreatment(FacialTreatmentDTO data, Long id);
    FacialTreatmentDTO updateFacialTreatment(FacialTreatmentDTO data, Long id);
    void delete(Long id);
}
