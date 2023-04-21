package com.f1.formula.one.series.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.f1.formula.one.series.domain.Driver;
import com.f1.formula.one.series.dto.DriverDTO;
import com.f1.formula.one.series.dto.MensagemDTO;
import com.f1.formula.one.series.service.DriverService;

@RestController
@RequestMapping(value = "/drivers")
public class DriverController {

	@Autowired
	private DriverService driverService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Driver> findById(@PathVariable Long id) {
		Driver driver = driverService.findByIdDriver(id);
		return ResponseEntity.ok(driver);
	}

	@RequestMapping(method = RequestMethod.GET)
	public Page<DriverDTO> findAll(Pageable pageable) {
		return driverService.findAll(pageable);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public MensagemDTO removeDriver(@PathVariable Long id) {
		return driverService.removeDriverById(id);
	}
}
