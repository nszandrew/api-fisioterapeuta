package br.com.nelmara.physiotherapist.domain.patient.dto;

import br.com.nelmara.physiotherapist.domain.patient.Gender;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.validation.constraints.*;

import java.util.Date;


public record PatientDTO(
        @NotBlank(message = "Primeiro nome é obrigatório")
        @Size(max = 100, message = "Primeiro nome deve ter no máximo 100 caracteres")
        @Column(name = "first_name")
        String firstName,

        @NotBlank(message = "Ultimo nome é obrigatório")
        @Size(max = 100, message = "Ultimo nome deve ter no máximo 100 caracteres")
        @Column(name = "last_name")
        String lastName,

        @Past(message = "Data de Nascimento deve ser uma data no passado")
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
        @Column(name = "date_of_birth")
        Date dateOfBirth,

        String address,

        @Email(message = "Email deve ser válido")
        String email,

        @Size(max = 20, message = "Telefone deve ter no máximo 20 caracteres")
        String phone,

        Gender gender,

        @Size(max = 100, message = "Profissão deve ter no máximo 100 caracteres")
        String profession,

        @Size(max = 255, message = "Indicação deve ter no máximo 255 caracteres")
        String indication
) {
}
