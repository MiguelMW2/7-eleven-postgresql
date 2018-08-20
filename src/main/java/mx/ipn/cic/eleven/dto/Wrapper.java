package mx.ipn.cic.eleven.dto;

import java.util.List;

import mx.ipn.cic.eleven.entities.ProductEntity;

public class Wrapper {

	private List<ProductEntity> product;
	
	private List<Double> quantity;

	public Wrapper() {
		super();
	}

	public Wrapper(List<ProductEntity> product, List<Double> quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}

	public List<ProductEntity> getProduct() {
		return product;
	}

	public void setProduct(List<ProductEntity> product) {
		this.product = product;
	}

	public List<Double> getQuantity() {
		return quantity;
	}

	public void setQuantity(List<Double> quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return String.format("Wrapper [product=%s, quantity=%s]", product, quantity);
	}
}
