package com.f1.formula.one.series.domain;

import java.util.ArrayList;
import java.util.List;

public class DriverTable {

	private List<Driver> listDriver = new ArrayList<>();

	public DriverTable() {
	}

	public DriverTable(List<Driver> listDriver) {
		this.listDriver = listDriver;
	}

	public List<Driver> getListDriver() {
		return listDriver;
	}

}
