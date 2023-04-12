package com.f1.formula.one.series.service.impl;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.f1.formula.one.series.domain.Driver;
import com.f1.formula.one.series.service.DriverService;

@Service
public class DriverServiceImpl implements DriverService {

	@Override
	public Driver findByIdDriver(String driverId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<Driver>> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
