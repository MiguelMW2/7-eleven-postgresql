package mx.ipn.cic.eleven.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.ipn.cic.eleven.entities.DetailSaleEntity;
import mx.ipn.cic.eleven.repositories.IDetailSaleRepository;

@Service
public class DetailSaleService {
	
	@Autowired
	private IDetailSaleRepository detailSaleRepository;

	public DetailSaleEntity save (Integer idSale, Integer idProduct) {
		return this.detailSaleRepository.findBySales_IdAndProducts_Id(idSale, idProduct);
		/*
		if(detailSale.getQuantityProduct() == null) {
			detailSale.setQuantityProduct(1);
		}
		else {
			detailSale.setQuantityProduct(	detailSale.getQuantityProduct()	+ 1 );
		}
		//this.detailSaleService.save(detailSale);*/
	}
}
	