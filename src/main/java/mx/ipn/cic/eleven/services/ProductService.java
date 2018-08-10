package mx.ipn.cic.eleven.services;

import java.util.List;

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
	
	public List<ProductEntity> search(String name, String upc) {
		return this.productRepository.findByNameContainingOrUpcContaining(name, upc);
	}
}
