package br.com.nelmara.physiotherapist.adapters.controllers;

import br.com.nelmara.physiotherapist.adapters.services.NeurologicalService;
import br.com.nelmara.physiotherapist.domain.treatment.types.neurologica.dto.NeurologicalDTO;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/neurological")
public class NeurologicalController {

    private final NeurologicalService service;

    public NeurologicalController(NeurologicalService service) {
        this.service = service;
    }

    @PostMapping("/{id}")
    @Transactional
    public ResponseEntity<NeurologicalDTO> addNeurological(@RequestBody @Valid NeurologicalDTO data , @PathVariable Long id) {
        service.addNeurologicalService(data, id);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<NeurologicalDTO> updateNeurological(@RequestBody @Valid NeurologicalDTO data, @PathVariable Long id) {
        service.updateNeurologicalService(data, id);
        return ResponseEntity.ok().body(data);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteNeurological(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
