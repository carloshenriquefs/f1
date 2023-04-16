package com.f1.formula.one.series.domain;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_driver")
public class DriverTable {

	private Long idDriverTb;
	private List<Driver> listDriver = new ArrayList<>();

	public DriverTable() {
	}

	public DriverTable(Long idDriverTb) {
		super();
		this.idDriverTb = idDriverTb;
	}

	public Long getIdDriverTb() {
		return idDriverTb;
	}

	public void setIdDriverTb(Long idDriverTb) {
		this.idDriverTb = idDriverTb;
	}

	public List<Driver> getListDriver() {
		return listDriver;
	}

}
