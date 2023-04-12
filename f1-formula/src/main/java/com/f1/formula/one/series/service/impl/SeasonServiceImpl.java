package com.f1.formula.one.series.service.impl;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.f1.formula.one.series.domain.Season;
import com.f1.formula.one.series.service.SeasonService;

@Service
public class SeasonServiceImpl implements SeasonService {

	@Override
	public Season findByIdConstructor(String constructorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Season findByIdDriver(String driverId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<Season>> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
