package com.f1.formula.one.series.domain;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "season")
public class Season implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String season;
	private String url;
	
	public Season() {
	}

	public Season(Long id, String season, String url) {
		super();
		this.id = id;
		this.season = season;
		this.url = url;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
