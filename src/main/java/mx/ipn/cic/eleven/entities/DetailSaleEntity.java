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

	private double quantityProduct;

	@ManyToOne
	@JoinColumn(name="fk_sales_id")
	private SaleEntity sales;

	@ManyToOne
	@JoinColumn(name="fk_products_id")
	private ProductEntity products;

	/*@DBRef
	 * @JsonBackReference
	 * private SellEntity sell
	 * @DBRef
	 * @Transient
	 * private List<SellDetailEntity> detail
	*/

	public DetailSaleEntity() {
		super();
	}

	public DetailSaleEntity(Integer id, double quantityProduct, SaleEntity sales, ProductEntity products) {
		super();
		this.id = id;
		this.quantityProduct = quantityProduct;
		this.sales = sales;
		this.products = products;
	}

	public DetailSaleEntity(double quantityProduct, SaleEntity sales, ProductEntity products) {
		super();
		this.quantityProduct = quantityProduct;
		this.sales = sales;
		this.products = products;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getQuantityProduct() {
		return quantityProduct;
	}

	public void setQuantityProduct(double quantityProduct) {
		this.quantityProduct = quantityProduct;
	}

	public SaleEntity getSales() {
		return sales;
	}

	public void setSales(SaleEntity sales) {
		this.sales = sales;
	}

	public ProductEntity getProducts() {
		return products;
	}

	public void setProducts(ProductEntity products) {
		this.products = products;
	}

	public double incrementQuantity() {
		return ++quantityProduct;
	}

	@Override
	public String toString() {
		return String.format("DetailSaleEntity [id=%s, quantityProduct=%s, sales=%s, products=%s]", id, quantityProduct,
				sales, products);
	}
}
