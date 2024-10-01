package br.com.nelmara.physiotherapist.adapters.repositories;

import br.com.nelmara.physiotherapist.domain.treatment.types.neurologica.NeurologicaTreatment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NeurologicalRepository extends JpaRepository <NeurologicaTreatment, Long> {
}
