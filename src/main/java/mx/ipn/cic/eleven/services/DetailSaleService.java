package mx.ipn.cic.eleven.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.ipn.cic.eleven.entities.DetailSaleEntity;
import mx.ipn.cic.eleven.repositories.IDetailSaleRepository;

@Service
public class DetailSaleService {
	
	@Autowired
	private IDetailSaleRepository detailSaleRepository;

	public DetailSaleEntity save (DetailSaleEntity detailSale) {
		DetailSaleEntity found = this.detailSaleRepository.findBySales_IdAndProducts_Id(detailSale.getSales().getId(), detailSale.getProducts().getId());
		if (found == null) {
			detailSale.setQuantityProduct(1);
			return this.detailSaleRepository.save(detailSale);
		}
		else {
			found.setQuantityProduct( found.incrementQuantity() );
			this.detailSaleRepository.save(found);
			return found;
		}
	}
}
