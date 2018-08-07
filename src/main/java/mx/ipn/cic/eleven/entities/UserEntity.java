package mx.ipn.cic.eleven.entities;

import javax.persistence.Entity;

@Entity
public class UserEntity {

	private Integer id;

	private String name;

	private String lastName;

	private String secondLastName;

	private String userName;

	private String password;

	public UserEntity(Integer id, String name, String lastName, String secondLastName, String userName, String password) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.secondLastName = secondLastName;
		this.userName = userName;
		this.password = password;
	}

	public UserEntity(String name, String lastName, String secondLastName, String userName, String password) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.secondLastName = secondLastName;
		this.userName = userName;
		this.password = password;
	}

	public UserEntity(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
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

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public String getsecondLastName() {
		return secondLastName;
	}

	public void setsecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}

	public String getuserName() {
		return userName;
	}

	public void setuserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return String.format("UserEntity [id=%s, name=%s, lastName=%s, secondLastName=%s, userName=%s, password=%s]",
				id, name, lastName, secondLastName, userName, password);
	}
}
