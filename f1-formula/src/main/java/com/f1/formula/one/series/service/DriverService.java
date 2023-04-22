package com.f1.formula.one.series.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.f1.formula.one.series.domain.Driver;
import com.f1.formula.one.series.dto.DriverDTO;
import com.f1.formula.one.series.dto.MensagemDTO;

public interface DriverService {

	Driver create(Driver driver);

	Driver findByIdDriver(Long id);

	Page<DriverDTO> findAll(Pageable pageable);

	MensagemDTO removeDriverById(Long id);
}
