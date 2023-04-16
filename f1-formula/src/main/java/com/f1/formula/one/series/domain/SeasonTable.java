package com.f1.formula.one.series.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_season")
public class SeasonTable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSeasonTb;
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

	public SeasonTable(Long idSeasonTb, String constructorId, String driverId, List<Season> listSeason) {
		super();
		this.idSeasonTb = idSeasonTb;
		this.constructorId = constructorId;
		this.driverId = driverId;
		this.listSeason = listSeason;
	}

	public Long getIdSeasonTb() {
		return idSeasonTb;
	}

	public void setIdSeasonTb(Long idSeasonTb) {
		this.idSeasonTb = idSeasonTb;
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
