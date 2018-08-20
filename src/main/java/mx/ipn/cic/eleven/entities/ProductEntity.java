package mx.ipn.cic.eleven.entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class ProductEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String name;

	private String description;

	private double price;

	private double stock;

	private String upc;

	@OneToMany(mappedBy="product")
	@JsonBackReference
	private Collection<DetailSaleEntity> detailSales = new ArrayList<DetailSaleEntity>();

	public ProductEntity() {
		super();
	}

	public ProductEntity(Integer id, String name, String description, double price, double stock, String upc) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stock = stock;
		this.upc = upc;
	}

	public ProductEntity(Integer id, String name, String description, double price, double stock, String upc,
			Collection<DetailSaleEntity> detailSales) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stock = stock;
		this.upc = upc;
		this.detailSales = detailSales;
	}

	public ProductEntity(String name, String description, double price, double stock, String upc,
			Collection<DetailSaleEntity> detailSales) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.stock = stock;
		this.upc = upc;
		this.detailSales = detailSales;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getStock() {
		return stock;
	}

	public void setStock(double stock) {
		this.stock = stock;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public Collection<DetailSaleEntity> getDetailSales() {
		return detailSales;
	}

	public void setDetailSales(Collection<DetailSaleEntity> detailSales) {
		this.detailSales = detailSales;
	}

	@Override
	public String toString() {
		return String.format(
				"ProductEntity [id=%s, name=%s, description=%s, price=%s, stock=%s, upc=%s, detailSales=%s]", id, name,
				description, price, stock, upc, detailSales);
	}
}
