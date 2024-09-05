package br.com.nelmara.physiotherapist.adapters.controller;

import br.com.nelmara.physiotherapist.adapters.service.TreatmentService;
import br.com.nelmara.physiotherapist.domain.entities.treatment.dto.TreatmentDTO;
import br.com.nelmara.physiotherapist.domain.entities.treatment.dto.UpdateTreatmentDTO;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/treatment")
public class TreatmentController {

    private final TreatmentService service;

    public TreatmentController(TreatmentService service) {
        this.service = service;
    }

    @PostMapping("/{id}/{tratamento}")
    @Transactional
    public ResponseEntity<TreatmentDTO> addTreatment(@RequestBody @Valid TreatmentDTO data, @PathVariable Long id, @PathVariable Long tratamento) {
        var treatment = service.addTreatment(data, id, tratamento);
        return ResponseEntity.status(HttpStatus.CREATED).body(treatment);
    }

    @PutMapping("/update/{id}")
    @Transactional
    public ResponseEntity<UpdateTreatmentDTO> updatePatient(@RequestBody @Valid UpdateTreatmentDTO data, @PathVariable Long id) {
        service.updateTreatment(data, id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
