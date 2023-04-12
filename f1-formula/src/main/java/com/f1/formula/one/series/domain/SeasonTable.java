package com.f1.formula.one.series.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SeasonTable implements Serializable {
	private static final long serialVersionUID = 1L;

	private String constructorId;
	private String driverId;

	private List<Season> listSeason = new ArrayList<>();

	public SeasonTable() {
	}

	public SeasonTable(String constructorId, String driverId) {
		super();
		this.constructorId = constructorId;
		this.driverId = driverId;
	}

	public String getConstructorId() {
		return constructorId;
	}

	public void setConstructorId(String constructorId) {
		this.constructorId = constructorId;
	}

	public String getDriverId() {
		return driverId;
	}

	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}

	public List<Season> getListSeason() {
		return listSeason;
	}

}
