package com.f1.formula.one.series.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.f1.formula.one.series.domain.Season;
import com.f1.formula.one.series.service.SeasonService;

@RestController
@RequestMapping(value = "/seasons")
public class SeasonController {

	@Autowired
	private SeasonService seasonService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Season> findById(@PathVariable Long id) {
		Season Season = seasonService.findByIdSeason(id);
		return ResponseEntity.ok(Season);
	}
}
