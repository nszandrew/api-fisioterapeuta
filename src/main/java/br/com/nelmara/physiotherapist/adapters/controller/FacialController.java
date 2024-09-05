package br.com.nelmara.physiotherapist.adapters.controller;

import br.com.nelmara.physiotherapist.adapters.service.FacialService;
import br.com.nelmara.physiotherapist.domain.entities.treatment.types.facial.dto.FacialTreatmentDTO;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/facial")
public class FacialController {

    private final FacialService service;


    public FacialController(FacialService service) {
        this.service = service;
    }

    @PostMapping("{id}")
    @Transactional
    public ResponseEntity<FacialTreatmentDTO> addFacialTreatment(@RequestBody @Valid FacialTreatmentDTO data, @PathVariable Long id) {
        service.addFacialTreatment(data, id);
        return ResponseEntity.ok().body(data);
    }
}
