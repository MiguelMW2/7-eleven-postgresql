package mx.ipn.cic.eleven.dto;

import mx.ipn.cic.eleven.entities.ProductEntity;

public class SaleDetailDto {

	private ProductEntity product;

	private double quantity;

	public SaleDetailDto() {
		super();
	}

	public SaleDetailDto(ProductEntity product, double quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}

	public ProductEntity getProduct() {
		return product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return String.format("SaleDetailDto [product=%s, quantity=%s]", product, quantity);
	}
}
