package com.f1.formula.one.series.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.f1.formula.one.series.domain.Season;

public interface SeasonService {

	Season findByIdConstructor(String constructorId);
	
	Season findByIdDriver(String driverId);
	
	ResponseEntity<List<Season>> findAll();
}
