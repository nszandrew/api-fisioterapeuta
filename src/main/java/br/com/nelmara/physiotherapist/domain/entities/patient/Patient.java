package br.com.nelmara.physiotherapist.domain.entities.patient;

import br.com.nelmara.physiotherapist.domain.entities.patient.dto.UpdatePatientDTO;
import br.com.nelmara.physiotherapist.domain.entities.user.User;
import br.com.nelmara.physiotherapist.domain.entities.treatment.history.TreatmentHistory;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tb_patient")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Patient implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Temporal(TemporalType.DATE)
    @Column(name = "date_of_birth")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date dateOfBirth;
    private String address;
    private String email;
    private String phone;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String profession;
    private String indication;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<TreatmentHistory> treatmentHistories;

    public void updatePatient(UpdatePatientDTO data) {
        if(data.firstName() != null){this.firstName = data.firstName();}
        if(data.lastName() != null){this.lastName = data.lastName();}
        if(data.dateOfBirth() != null){this.dateOfBirth = data.dateOfBirth();}
        if(data.address() != null){this.address = data.address();}
        if(data.email() != null){this.email = data.email();}
        if(data.phone() != null){this.phone = data.phone();}
        if(data.gender() != null){this.gender = data.gender();}
        if(data.profession() != null){this.profession = data.profession();}
        if(data.indication() != null){this.indication = data.indication();}
        this.updatedAt = LocalDateTime.now();
    }

}
