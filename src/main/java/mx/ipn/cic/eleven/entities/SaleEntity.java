package mx.ipn.cic.eleven.entities;

import java.util.Date;
import javax.persistence.Entity;

@Entity
public class SaleEntity {

	private Integer id;

	private Date date;

	private Double total;

	private String payment;

	public SaleEntity(Integer id, Date date, Double total, String payment) {
		super();
		this.id = id;
		this.date = date;
		this.total = total;
		this.payment = payment;
	}

	public SaleEntity(Date date, Double total, String payment) {
		super();
		this.date = date;
		this.total = total;
		this.payment = payment;
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

	@Override
	public String toString() {
		return String.format("SaleEntity [id=%s, date=%s, total=%s, payment=%s]", id, date, total, payment);
	}
}
