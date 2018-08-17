package mx.ipn.cic.eleven.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.ipn.cic.eleven.entities.ProductEntity;
import mx.ipn.cic.eleven.repositories.IProductRepository;

@Service
public class ProductService {

	@Autowired
	private IProductRepository productRepository;

	public List<ProductEntity> allProducts() {
		return this.productRepository.findAll();
	}
	
	public ProductEntity register(ProductEntity product) {
		return this.productRepository.save(product);
	}
	
	public List<ProductEntity> findByNameUpc(String name, String upc) {
		return this.productRepository.findByNameContainingOrUpcContaining(name, upc);
	}

	public ProductEntity findById(Integer id) {
		Optional<ProductEntity> found = this.productRepository.findById(id);
		try {
			return found.get();
		} catch (NoSuchElementException e) {
			System.out.println("No se encontró el producto");
		}
		return null;
	}

	public boolean delete(Integer id) {
		this.productRepository.deleteById(id);
		return true;
	}
}
