package mx.ipn.cic.eleven.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.ipn.cic.eleven.entities.ProductEntity;
import java.lang.String;

@Repository
public interface IProductRepository extends JpaRepository<ProductEntity, Integer>{
	 List<ProductEntity> findByNameContainingOrUpcContaining(String name, String upc);
}
