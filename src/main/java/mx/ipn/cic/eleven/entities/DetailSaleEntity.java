package mx.ipn.cic.eleven.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class DetailSaleEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private double quantity;

	@ManyToOne
	@JoinColumn(name="fk_sales_id")
	private SaleEntity sale;

	@ManyToOne
	@JoinColumn(name="fk_products_id")
	private ProductEntity product;

	public DetailSaleEntity(Integer id, double quantity, SaleEntity sale, ProductEntity product) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.sale = sale;
		this.product = product;
	}

	public DetailSaleEntity(double quantity, SaleEntity sale, ProductEntity product) {
		super();
		this.quantity = quantity;
		this.sale = sale;
		this.product = product;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public SaleEntity getSale() {
		return sale;
	}

	public void setSale(SaleEntity sale) {
		this.sale = sale;
	}

	public ProductEntity getProduct() {
		return product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return String.format("DetailSaleEntity [id=%s, quantity=%s, sale=%s, product=%s]", id, quantity, sale, product);
	}
}
