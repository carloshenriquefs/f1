package com.f1.formula.one.series.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.f1.formula.one.series.domain.Driver;
import com.f1.formula.one.series.dto.DriverDTO;

public interface DriverService {

	Driver findByIdDriver(Long id);

	// ResponseEntity<List<Driver>> findAll();

	Page<DriverDTO> findAll(Pageable pageable);
}
