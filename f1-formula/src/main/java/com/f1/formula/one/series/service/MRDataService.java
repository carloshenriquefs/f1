package com.f1.formula.one.series.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.f1.formula.one.series.domain.MRData;

public interface MRDataService {

	ResponseEntity<List<MRData>> findAll();
	
}
