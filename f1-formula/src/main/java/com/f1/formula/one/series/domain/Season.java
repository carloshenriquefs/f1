package com.f1.formula.one.series.domain;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "season")
public class Season implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String season;
	private String url;

	@ManyToOne
	private SeasonTable seasonTb;

	public Season() {
	}

	public Season(Long id, String season, String url) {
		super();
		this.id = id;
		this.season = season;
		this.url = url;
	}

	public Season(Long id, String season, String url, SeasonTable seasonTb) {
		super();
		this.id = id;
		this.season = season;
		this.url = url;
		this.seasonTb = seasonTb;
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Season other = (Season) obj;
		return Objects.equals(id, other.id);
	}

}
