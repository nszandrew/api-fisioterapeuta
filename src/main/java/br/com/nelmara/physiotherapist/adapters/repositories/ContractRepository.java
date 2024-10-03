package br.com.nelmara.physiotherapist.adapters.repositories;

import br.com.nelmara.physiotherapist.domain.patient.contract.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Long> {

    @Query("SELECT c.contractText FROM Contract c WHERE c.patient.id = :id")
    String findByPatientId(@Param("id") Long id);
}
