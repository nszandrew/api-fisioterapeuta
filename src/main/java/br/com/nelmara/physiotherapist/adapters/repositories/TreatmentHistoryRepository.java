package br.com.nelmara.physiotherapist.adapters.repositories;

import br.com.nelmara.physiotherapist.domain.entities.treatment.history.TreatmentHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreatmentHistoryRepository extends JpaRepository<TreatmentHistory, Long> {
}
