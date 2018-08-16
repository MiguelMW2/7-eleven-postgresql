package mx.ipn.cic.eleven.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.ipn.cic.eleven.entities.DetailSaleEntity;

@Repository
public interface IDetailSaleRepository extends JpaRepository<DetailSaleEntity, Integer>{
	DetailSaleEntity findBySales_IdAndProducts_Id(Integer idSale, Integer idProduct);

	List<DetailSaleEntity> findBySales_Id(Integer id);
}
