package br.com.nelmara.physiotherapist.adapters.repositories;

import br.com.nelmara.physiotherapist.domain.treatment.types.corporal.CorporalTreatment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorporalRepository extends JpaRepository<CorporalTreatment, Long> {
}
