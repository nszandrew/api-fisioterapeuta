package br.com.nelmara.physiotherapist.adapters.controller;

import br.com.nelmara.physiotherapist.adapters.service.NeurologicalService;
import br.com.nelmara.physiotherapist.domain.entities.treatment.types.neurologica.dto.NeurologicalDTO;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
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
        var sucess = service.addNeurologicalService(data, id);
        return ResponseEntity.ok().body(sucess);
    }
}
