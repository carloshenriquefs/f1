package com.f1.formula.one.series.dto;

import com.f1.formula.one.series.domain.Driver;
import com.f1.formula.one.series.domain.DriverTable;

public class DriverDTO {

	private Long id;
	private String driver;
	private String url;
	private String givenName;
	private String familyName;
	private String dataOfBirth;
	private String nationality;

	private DriverTable driverTb;
	
	public DriverDTO() {
	}
	
	public DriverDTO(Long id, String driver, String url, String givenName, String familyName, String dataOfBirth,
			String nationality, DriverTable driverTb) {
		super();
		this.id = id;
		this.driver = driver;
		this.url = url;
		this.givenName = givenName;
		this.familyName = familyName;
		this.dataOfBirth = dataOfBirth;
		this.nationality = nationality;
		this.driverTb = driverTb;
	}

	public DriverDTO(Driver driver) {
		id = driver.getId();
		this.driver = driver.getDriver();
		url = driver.getUrl();
		givenName = driver.getGivenName();
		familyName = driver.getFamilyName();
		dataOfBirth = driver.getDataOfBirth();
		nationality = driver.getNationality();
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

}
