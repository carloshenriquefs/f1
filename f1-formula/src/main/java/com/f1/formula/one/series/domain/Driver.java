package com.f1.formula.one.series.domain;

import java.io.Serializable;

public class Driver implements Serializable {
	private static final long serialVersionUID = 1L;

	private String driverId;
	private String url;
	private String givenName;
	private String familyName;
	private String dataOfBirth;
	private String nationality;

	public Driver() {
	}

	public Driver(String driverId, String url, String givenName, String familyName, String dataOfBirth,
			String nationality) {
		super();
		this.driverId = driverId;
		this.url = url;
		this.givenName = givenName;
		this.familyName = familyName;
		this.dataOfBirth = dataOfBirth;
		this.nationality = nationality;
	}

	public String getDriverId() {
		return driverId;
	}

	public void setDriverId(String driverId) {
		this.driverId = driverId;
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

}
