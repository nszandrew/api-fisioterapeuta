package br.com.nelmara.physiotherapist.adapters.controller;

import br.com.nelmara.physiotherapist.adapters.service.PatientService;
import br.com.nelmara.physiotherapist.domain.entities.patient.dto.GetPatientDTO;
import br.com.nelmara.physiotherapist.domain.entities.patient.dto.PatientDTO;
import br.com.nelmara.physiotherapist.domain.entities.patient.dto.UpdatePatientDTO;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patient")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping
    @Transactional
    public ResponseEntity<PatientDTO> createPatient(@RequestBody @Valid PatientDTO data) {
        patientService.addPatient(data);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Page<GetPatientDTO>> getPatients(
            @RequestParam(value = "page", defaultValue = "0") Integer page,
            @RequestParam(value = "size", defaultValue = "12") Integer size,
            @RequestParam(value = "direction", defaultValue = "asc") String direction) {
        var sortDirection = "desc".equalsIgnoreCase(direction) ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortDirection, "firstName"));
        return ResponseEntity.ok(patientService.findAll(pageable));
    }

    @GetMapping("/fullname/{firstname}-{lastname}")
    public ResponseEntity<List<GetPatientDTO>> getPatientsByFirstName(@PathVariable String firstname, @PathVariable String lastname){
        var patient = patientService.findByFirstName(firstname, lastname);
        return new ResponseEntity<>(patient, HttpStatus.OK);
    }


    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<UpdatePatientDTO> updatePatient(@RequestBody @Valid UpdatePatientDTO data, @PathVariable Long id) {
        var newPatient = patientService.updatePatient(data, id);
        return new ResponseEntity<>(newPatient, HttpStatus.OK);
    }
}
