package mx.ipn.cic.eleven.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.ipn.cic.eleven.entities.DetailSaleEntity;
import mx.ipn.cic.eleven.entities.ProductEntity;
import mx.ipn.cic.eleven.entities.SaleEntity;

@Service
public class DetailSaleService {

	@Autowired
	private DetailSaleService detailSaleService;

	public void save (ProductEntity product) {
		DetailSaleEntity detailSale = new DetailSaleEntity(1, null, product);
		
		
		if(detailSale.getQuantityProduct() == null) {
			detailSale.setQuantityProduct(1);
		}
		else {
			detailSale.setQuantityProduct(	detailSale.getQuantityProduct()	+ 1 );
		}
		//this.detailSaleService.save(detailSale);
	}
}
