package br.com.nelmara.physiotherapist.adapters.repositories;

import br.com.nelmara.physiotherapist.domain.entities.treatment.Treatment;
import br.com.nelmara.physiotherapist.domain.entities.treatment.TreatmentType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TreatmentRepository extends JpaRepository<Treatment, Long> {

    //ERRO NO METODO
    Optional<Treatment> findByTreatmentType(TreatmentType treatmentType);
}
