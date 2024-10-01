package br.com.nelmara.physiotherapist.adapters.repositories;

import br.com.nelmara.physiotherapist.domain.patient.Patient;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Optional<Patient> findById(Long id);

    @Query("SELECT p FROM Patient p WHERE LOWER(p.firstName) LIKE LOWER(CONCAT('%', :firstName, '%')) AND (:lastName IS NULL OR LOWER(p.lastName) LIKE LOWER(CONCAT('%', :lastName, '%')))")
    List<Patient> findByFirstNameContainingIgnoreCase(@Param("firstName") String firstName, @Param("lastName") String lastName);

    @Query("SELECT p FROM Patient p LEFT JOIN FETCH p.treatmentHistories th "
            + "LEFT JOIN FETCH th.neurological n "
            + "LEFT JOIN FETCH th.corporal c "
            + "LEFT JOIN FETCH th.facial f "
            + "LEFT JOIN FETCH th.ozonio o")
    List<Patient> findAllWithTreatments(Pageable pageable);


}
