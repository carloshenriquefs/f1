package com.f1.formula.one.series.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.f1.formula.one.series.domain.MRData;
import com.f1.formula.one.series.dto.MRDataDTO;
import com.f1.formula.one.series.service.MRDataService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/mrdatas")
public class MRDataController {

	@Autowired
	private MRDataService mrDataService;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<MRData> create(@RequestBody @Valid MRData mrData) {
		MRData mrDataCreated = mrDataService.create(mrData);
		return ResponseEntity.status(HttpStatus.CREATED).body(mrDataCreated);
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<MRDataDTO> findAll() {
		return mrDataService.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<MRData> findById(@PathVariable Long id) {
		MRData mrData = mrDataService.findByIdMRData(id);
		return ResponseEntity.ok(mrData);
	}
}
