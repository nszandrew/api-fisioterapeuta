package br.com.nelmara.physiotherapist.adapters.controllers;

import br.com.nelmara.physiotherapist.adapters.services.PatientService;
import br.com.nelmara.physiotherapist.domain.patient.dto.GetPatientDTO;
import br.com.nelmara.physiotherapist.domain.patient.dto.PatientDTO;
import br.com.nelmara.physiotherapist.domain.patient.dto.UpdatePatientDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@SecurityRequirement(name = "bearerAuth")
@Tag(name = "Patient")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @Operation(
            description = "Criar um novo paciente / Create a new Patient",
            summary = "Adicionar um novo paciente ao banco de dados / Add a new Patient to Database",
            responses = {
                    @ApiResponse(
                            description = "Success",
                            responseCode = "201"
                    ),
                    @ApiResponse(
                            description = "Unauthorized / Invalid Token",
                            responseCode = "403"
                    )
            }
    )
    @PostMapping
    @Transactional
    public ResponseEntity<PatientDTO> createPatient(@RequestBody @Valid PatientDTO data) {
        patientService.addPatient(data);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    @Operation(
            description = "Pegar todos os pacientes / GetAll patients",
            responses = {
                    @ApiResponse(
                            description = "Success",
                            responseCode = "201"
                    ),
                    @ApiResponse(
                            description = "Unauthorized / Invalid Token",
                            responseCode = "403"
                    )
            }
    )
    @GetMapping
    public ResponseEntity<Page<GetPatientDTO>> getPatients(
            @RequestParam(value = "page", defaultValue = "0") Integer page,
            @RequestParam(value = "size", defaultValue = "12") Integer size,
            @RequestParam(value = "direction", defaultValue = "asc") String direction) {
        var sortDirection = "desc".equalsIgnoreCase(direction) ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortDirection, "firstName"));
        return ResponseEntity.ok(patientService.findAll(pageable));
    }

    @Operation(
            description = "Pegar todos os pacientes por Nome Completo / GetAll patients by a full name",
            summary = "Pegar todos os pacientes por Nome Completo / GetAll patients by a full name",
            responses = {
                    @ApiResponse(
                            description = "Success",
                            responseCode = "201"
                    ),
                    @ApiResponse(
                            description = "Unauthorized / Invalid Token",
                            responseCode = "403"
                    ),
            }
    )
    @Schema(deprecated = true)
    @GetMapping("/fullname/{firstname}-{lastname}")
    public ResponseEntity<List<GetPatientDTO>> getPatientsByFirstName(@PathVariable String firstname, @PathVariable String lastname){
        var patient = patientService.findByFirstName(firstname, lastname);
        return new ResponseEntity<>(patient, HttpStatus.OK);
    }


    @Operation(
            description = "Editar pacientes pelo id / Edit patients by id",
            summary = "Editar pacientes pelo id / Edit patients by id",
            responses = {
                    @ApiResponse(
                            description = "Success",
                            responseCode = "201"
                    ),
                    @ApiResponse(
                            description = "Unauthorized / Invalid Token",
                            responseCode = "403"
                    ),
            }
    )
    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<UpdatePatientDTO> updatePatient(@RequestBody @Valid UpdatePatientDTO data, @PathVariable Long id) {
        var newPatient = patientService.updatePatient(data, id);
        return new ResponseEntity<>(newPatient, HttpStatus.OK);
    }

    @Operation(
            description = "Deletar pacientes por ID / Delete patient by id",
            summary = "Deletar pacientes por ID / Delete patient by id",
            responses = {
                    @ApiResponse(
                            description = "Success",
                            responseCode = "201"
                    ),
                    @ApiResponse(
                            description = "Unauthorized / Invalid Token",
                            responseCode = "403"
                    ),
            }
    )
    @DeleteMapping("/{id}")
    public ResponseEntity deletePatient(@PathVariable Long id) {
        patientService.delete(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
