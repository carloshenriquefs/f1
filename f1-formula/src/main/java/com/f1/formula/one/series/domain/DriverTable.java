package com.f1.formula.one.series.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_driver")
public class DriverTable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDriverTb;

	@OneToMany
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

	public void setListDriver(List<Driver> listDriver) {
		this.listDriver = listDriver;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idDriverTb);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DriverTable other = (DriverTable) obj;
		return Objects.equals(idDriverTb, other.idDriverTb);
	}

}
