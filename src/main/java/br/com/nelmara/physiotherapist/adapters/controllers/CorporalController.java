package br.com.nelmara.physiotherapist.adapters.controllers;

import br.com.nelmara.physiotherapist.adapters.services.CorporalService;
import br.com.nelmara.physiotherapist.domain.treatment.types.corporal.dto.CorporalTreatmentDTO;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/corporal")
public class CorporalController {

    private final CorporalService service;


    public CorporalController(CorporalService service) {
        this.service = service;
    }

    @PostMapping("/{id}")
    @Transactional
    public ResponseEntity<CorporalTreatmentDTO> addCorporalTreatment(@RequestBody @Valid CorporalTreatmentDTO data, @PathVariable Long id) {
        service.addCorporal(data, id);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<CorporalTreatmentDTO> updateCorporalTreatment(@RequestBody @Valid CorporalTreatmentDTO data, @PathVariable Long id) {
        service.updateCorporal(data, id);
        return ResponseEntity.ok().body(data);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteCorporalTreatment(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
