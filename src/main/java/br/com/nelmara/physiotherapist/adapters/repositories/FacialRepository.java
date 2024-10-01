package br.com.nelmara.physiotherapist.adapters.repositories;

import br.com.nelmara.physiotherapist.domain.treatment.types.facial.FacialTreatment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacialRepository extends JpaRepository<FacialTreatment, Long> {
}
