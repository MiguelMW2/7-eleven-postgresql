package mx.ipn.cic.eleven.services;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.ipn.cic.eleven.entities.SaleEntity;
import mx.ipn.cic.eleven.repositories.ISaleRepository;

@Service
public class SaleService {

	@Autowired
	private ISaleRepository saleRepository;

	public SaleEntity findById(Integer id) {
		Optional<SaleEntity> found = this.saleRepository.findById(id);
		try {
			return found.get();
		} catch (NoSuchElementException e) {
			System.out.println("No se encontró el elemento");
		}
		return null;
	}

	public SaleEntity save(SaleEntity sale) {
		return this.saleRepository.save(sale);
	}
}
