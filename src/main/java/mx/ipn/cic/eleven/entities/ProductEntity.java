package mx.ipn.cic.eleven.entities;

import javax.persistence.Entity;

@Entity
public class ProductEntity {

	private Integer id;

	private String name;

	private String description;

	private Double price;

	private Integer stock;

	private Integer upc;

	public ProductEntity(Integer id, String name, String description, Double price, Integer stock, Integer upc) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stock = stock;
		this.upc = upc;
	}

	public ProductEntity(String name, String description, Double price, Integer stock, Integer upc) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.stock = stock;
		this.upc = upc;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Integer getUpc() {
		return upc;
	}

	public void setUpc(Integer upc) {
		this.upc = upc;
	}

	@Override
	public String toString() {
		return String.format("ProductEntity [id=%s, name=%s, description=%s, price=%s, stock=%s, upc=%s]", id, name,
				description, price, stock, upc);
	}
}
