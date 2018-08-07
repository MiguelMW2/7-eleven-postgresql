package mx.ipn.cic.eleven.entities;

import javax.persistence.Entity;

@Entity
public class AddressEntity {

	private Integer id;

	private String street;

	private String district;

	private Integer externalNumber;

	private Integer internalNumber;

	private String state;

	private String zipCode;

	public AddressEntity(Integer id, String street, String district, Integer externalNumber, Integer internalNumber,
			String state, String zipCode) {
		super();
		this.id = id;
		this.street = street;
		this.district = district;
		this.externalNumber = externalNumber;
		this.internalNumber = internalNumber;
		this.state = state;
		this.zipCode = zipCode;
	}

	public AddressEntity(String street, String district, Integer externalNumber, Integer internalNumber, String state,
			String zipCode) {
		super();
		this.street = street;
		this.district = district;
		this.externalNumber = externalNumber;
		this.internalNumber = internalNumber;
		this.state = state;
		this.zipCode = zipCode;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public Integer getExternalNumber() {
		return externalNumber;
	}

	public void setExternalNumber(Integer externalNumber) {
		this.externalNumber = externalNumber;
	}

	public Integer getInternalNumber() {
		return internalNumber;
	}

	public void setInternalNumber(Integer internalNumber) {
		this.internalNumber = internalNumber;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return String.format(
				"AddressEntity [id=%s, street=%s, district=%s, externalNumber=%s, internalNumber=%s, state=%s, zipCode=%s]",
				id, street, district, externalNumber, internalNumber, state, zipCode);
	}
}
