package com.f1.formula.one.series.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.f1.formula.one.series.domain.Driver;
import com.f1.formula.one.series.dto.DriverDTO;
import com.f1.formula.one.series.message.Message;
import com.f1.formula.one.series.service.DriverService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@RestController
@RequestMapping(value = "/drivers")
public class DriverController {

	@Autowired
	private DriverService driverService;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Driver> create(@RequestBody @Valid Driver driver) {
		Driver driverCreated = driverService.create(driver);
		return ResponseEntity.status(HttpStatus.CREATED).body(driverCreated);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Driver> findById(@PathVariable Long id) {
		Driver driver = driverService.findByIdDriver(id);
		return ResponseEntity.ok(driver);
	}

	@RequestMapping(method = RequestMethod.GET)
	public Page<DriverDTO> findAll(Pageable pageable) {
		return driverService.findAll(pageable);
	}

	@RequestMapping(value = "/driver/{driver}", method = RequestMethod.GET)
	public ResponseEntity<Driver> getByDriver(@PathVariable("driver") String driver) {
		return driverService.getByDriver(driver).map(d -> ResponseEntity.ok(d))
				.orElseGet(() -> ResponseEntity.notFound().build());
	}

	@RequestMapping(value = "/givenName/{givenName}", method = RequestMethod.GET)
	public ResponseEntity<Driver> getByGivenName(@PathVariable("givenName") String givenName) {
		return driverService.getByGivenName(givenName).map(gv -> ResponseEntity.ok(gv))
				.orElseGet(() -> ResponseEntity.notFound().build());
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<DriverDTO> update(@PathVariable @NotNull Long id, @RequestBody @Valid DriverDTO dto) {
		DriverDTO atualizado = driverService.updateDriver(id, dto);
		return ResponseEntity.ok(atualizado);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public Message removeDriver(@PathVariable Long id) {
		return driverService.removeDriverById(id);
	}
}
