package mx.ipn.cic.eleven.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DetailSaleEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Integer quantityProduct;

	public DetailSaleEntity(Integer id, Integer quantityProduct) {
		super();
		this.id = id;
		this.quantityProduct = quantityProduct;
	}

	public DetailSaleEntity(Integer quantityProduct) {
		super();
		this.quantityProduct = quantityProduct;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantityProduct() {
		return quantityProduct;
	}

	public void setQuantityProduct(Integer quantityProduct) {
		this.quantityProduct = quantityProduct;
	}

	@Override
	public String toString() {
		return String.format("DetailSaleEntity [id=%s, quantityProduct=%s]", id, quantityProduct);
	}
}
