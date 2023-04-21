package com.f1.formula.one.series.dto;

import com.f1.formula.one.series.domain.Season;
import com.f1.formula.one.series.domain.SeasonTable;

public class SeasonDTO {

	private Long id;
	private String season;
	private String url;

	private SeasonTable seasonTb;

	public SeasonDTO() {
	}

	public SeasonDTO(Long id, String season, String url, SeasonTable seasonTb) {
		super();
		this.id = id;
		this.season = season;
		this.url = url;
		this.seasonTb = seasonTb;
	}

	public SeasonDTO(Season season) {
		id = season.getId();
		this.season = season.getSeason();
		url = season.getUrl();
		seasonTb = season.getSeasonTb();
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

	public SeasonTable getSeasonTb() {
		return seasonTb;
	}

	public void setSeasonTb(SeasonTable seasonTb) {
		this.seasonTb = seasonTb;
	}

}
