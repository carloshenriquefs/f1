package com.f1.formula.one.series.domain;

import java.io.Serializable;

public class MRData implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String xmlns;
	private String series;
	private String url;
	private String limit;
	private String offSet;
	private String total;
	
	public MRData() {
	}

	public MRData(String xmlns, String series, String url, String limit, String offSet, String total) {
		super();
		this.xmlns = xmlns;
		this.series = series;
		this.url = url;
		this.limit = limit;
		this.offSet = offSet;
		this.total = total;
	}

	public String getXmlns() {
		return xmlns;
	}

	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}

	public String getOffSet() {
		return offSet;
	}

	public void setOffSet(String offSet) {
		this.offSet = offSet;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}
}
