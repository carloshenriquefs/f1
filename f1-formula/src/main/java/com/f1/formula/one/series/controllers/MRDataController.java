package com.f1.formula.one.series.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.f1.formula.one.series.dto.MRDataDTO;
import com.f1.formula.one.series.service.MRDataService;

@RestController
@RequestMapping(value = "/mrdatas")
public class MRDataController {

	@Autowired
	private MRDataService mrDataService;

	@RequestMapping(method = RequestMethod.GET)
	public List<MRDataDTO> findAll() {
		return mrDataService.findAll();
	}
}