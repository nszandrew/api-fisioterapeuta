package br.com.nelmara.physiotherapist.adapters.repositories;

import br.com.nelmara.physiotherapist.domain.entities.treatment.types.ozonio.OzonioTreatment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OzonioRepository extends JpaRepository<OzonioTreatment, Long> {
}
