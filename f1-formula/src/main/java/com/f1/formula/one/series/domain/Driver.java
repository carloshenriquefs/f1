package com.f1.formula.one.series.domain;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "driver")
public class Driver implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String driver;
	private String url;
	private String givenName;
	private String familyName;
	private String dataOfBirth;
	private String nationality;

	@ManyToOne
	private DriverTable driverTb;

	public Driver() {
	}

	public Driver(Long id, String driver, String url, String givenName, String familyName, String dataOfBirth,
			String nationality) {
		super();
		this.id = id;
		this.driver = driver;
		this.url = url;
		this.givenName = givenName;
		this.familyName = familyName;
		this.dataOfBirth = dataOfBirth;
		this.nationality = nationality;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getDataOfBirth() {
		return dataOfBirth;
	}

	public void setDataOfBirth(String dataOfBirth) {
		this.dataOfBirth = dataOfBirth;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public DriverTable getDriverTb() {
		return driverTb;
	}

	public void setDriverTb(DriverTable driverTb) {
		this.driverTb = driverTb;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Driver other = (Driver) obj;
		return Objects.equals(id, other.id);
	}

}
