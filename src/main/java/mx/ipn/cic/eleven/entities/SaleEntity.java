package mx.ipn.cic.eleven.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class SaleEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Date date;

	private Double total;

	private String payment;

	@ManyToOne
	@JoinColumn(name="fk_users_id")
	private UserEntity users;

	@OneToMany(mappedBy="sales")
	private Collection<DetailSaleEntity> detailSales = new ArrayList<DetailSaleEntity>();

	public SaleEntity() {
		super();
	}

	public SaleEntity(Integer id, Date date, Double total, String payment, UserEntity users,
			Collection<DetailSaleEntity> detailSales) {
		super();
		this.id = id;
		this.date = date;
		this.total = total;
		this.payment = payment;
		this.users = users;
		this.detailSales = detailSales;
	}

	public SaleEntity(Date date, Double total, String payment, UserEntity users,
			Collection<DetailSaleEntity> detailSales) {
		super();
		this.date = date;
		this.total = total;
		this.payment = payment;
		this.users = users;
		this.detailSales = detailSales;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public UserEntity getUsers() {
		return users;
	}

	public void setUsers(UserEntity users) {
		this.users = users;
	}

	public Collection<DetailSaleEntity> getDetailSales() {
		return detailSales;
	}

	public void setDetailSales(Collection<DetailSaleEntity> detailSales) {
		this.detailSales = detailSales;
	}

	@Override
	public String toString() {
		return String.format("SaleEntity [id=%s, date=%s, total=%s, payment=%s, users=%s, detailSales=%s]", id, date,
				total, payment, users, detailSales);
	}
}
