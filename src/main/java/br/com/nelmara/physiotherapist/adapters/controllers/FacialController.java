package br.com.nelmara.physiotherapist.adapters.controllers;

import br.com.nelmara.physiotherapist.adapters.services.FacialService;
import br.com.nelmara.physiotherapist.domain.treatment.types.facial.dto.FacialTreatmentDTO;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/facial")
public class FacialController {

    private final FacialService service;


    public FacialController(FacialService service) {
        this.service = service;
    }

    @PostMapping("/{id}")
    @Transactional
    public ResponseEntity<FacialTreatmentDTO> addFacialTreatment(@RequestBody @Valid FacialTreatmentDTO data, @PathVariable Long id) {
        service.addFacialTreatment(data, id);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<FacialTreatmentDTO> updateFacialTreatment(@RequestBody @Valid FacialTreatmentDTO data, @PathVariable Long id) {
        service.updateFacialTreatment(data, id);
        return ResponseEntity.ok().body(data);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteFacialTreatment(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
