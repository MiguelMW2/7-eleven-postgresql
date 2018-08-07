package mx.ipn.cic.eleven.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.ipn.cic.eleven.entities.AddressEntity;

@Repository
public interface IAddressRepository extends JpaRepository<AddressEntity, Integer>{

}
