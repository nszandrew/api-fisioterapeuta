package br.com.nelmara.physiotherapist.adapters.controller;

import br.com.nelmara.physiotherapist.adapters.service.OzonioService;
import br.com.nelmara.physiotherapist.domain.treatment.types.ozonio.dto.OzonioTreatmentDTO;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ozonio")
public class OzonioController {

    private final OzonioService service;

    public OzonioController(OzonioService service) {
        this.service = service;
    }

    @PostMapping("/{id}")
    @Transactional
    public ResponseEntity<OzonioTreatmentDTO> addOzonio(@RequestBody @Valid OzonioTreatmentDTO data, @PathVariable Long id) {
        service.addOzonioTreatment(data, id);
        return ResponseEntity.ok().body(data);
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<OzonioTreatmentDTO> updateOzonio(@RequestBody @Valid OzonioTreatmentDTO data, @PathVariable Long id) {
        service.updateOzonioTreatment(data, id);
        return ResponseEntity.ok().body(data);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteOzonio(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
