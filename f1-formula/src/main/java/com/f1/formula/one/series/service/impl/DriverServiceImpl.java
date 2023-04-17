package com.f1.formula.one.series.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.f1.formula.one.series.domain.Driver;
import com.f1.formula.one.series.repositories.DriverRepository;
import com.f1.formula.one.series.service.DriverService;

@Service
public class DriverServiceImpl implements DriverService {

	@Autowired
	private DriverRepository driverRepository;
	
	@Override
	public Driver findByIdDriver(Long id) {
		Optional<Driver> optionalDriver = driverRepository.findById(id);
		return optionalDriver.orElse(null);
	}

	@Override
	public ResponseEntity<List<Driver>> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
