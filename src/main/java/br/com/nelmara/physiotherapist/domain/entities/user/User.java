package br.com.nelmara.physiotherapist.domain.entities.user;

import br.com.nelmara.physiotherapist.domain.entities.patient.Patient;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tb_user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String login;
    private String password;
    private UserType type;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Patient> patient;


}
