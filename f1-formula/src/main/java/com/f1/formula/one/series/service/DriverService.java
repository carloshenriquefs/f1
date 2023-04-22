package com.f1.formula.one.series.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.f1.formula.one.series.domain.Driver;
import com.f1.formula.one.series.dto.DriverDTO;
import com.f1.formula.one.series.dto.MensagemDTO;

public interface DriverService {

	Driver create(Driver driver);

	Driver findByIdDriver(Long id);

	Page<DriverDTO> findAll(Pageable pageable);
	
	Optional<Driver> getByDriver(String driver);

	MensagemDTO removeDriverById(Long id);
}
