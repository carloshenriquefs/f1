package com.f1.formula.one.series.domain;

import java.io.Serializable;

public class Season implements Serializable {
	private static final long serialVersionUID = 1L;

	private String season;
	private String url;
	
	public Season() {
	}

	public Season(String season, String url) {
		super();
		this.season = season;
		this.url = url;
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
