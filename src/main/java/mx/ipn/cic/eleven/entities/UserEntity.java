package mx.ipn.cic.eleven.entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class UserEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String name;

	private String lastName;

	private String secondLastName;

	private String userName;

	private String password;

	@OneToMany(mappedBy="users")
	private Collection<SaleEntity> sales = new ArrayList<SaleEntity>();

	public UserEntity() {
		super();
	}

	public UserEntity(Integer id, String name, String lastName, String secondLastName, String userName, String password,
			Collection<SaleEntity> sales) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.secondLastName = secondLastName;
		this.userName = userName;
		this.password = password;
		this.sales = sales;
	}

	public UserEntity(String name, String lastName, String secondLastName, String userName, String password,
			Collection<SaleEntity> sales) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.secondLastName = secondLastName;
		this.userName = userName;
		this.password = password;
		this.sales = sales;
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSecondLastName() {
		return secondLastName;
	}

	public void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Collection<SaleEntity> getSales() {
		return sales;
	}

	public void setSales(Collection<SaleEntity> sales) {
		this.sales = sales;
	}

	@Override
	public String toString() {
		return String.format(
				"UserEntity [id=%s, name=%s, lastName=%s, secondLastName=%s, userName=%s, password=%s, sales=%s]", id,
				name, lastName, secondLastName, userName, password, sales);
	}
}
