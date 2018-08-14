package mx.ipn.cic.eleven.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.ipn.cic.eleven.entities.SaleEntity;

@Repository
public interface ISaleRepository extends JpaRepository<SaleEntity, Integer>{

}
