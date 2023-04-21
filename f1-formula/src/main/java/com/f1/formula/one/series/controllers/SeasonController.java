package com.f1.formula.one.series.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.f1.formula.one.series.domain.Season;
import com.f1.formula.one.series.dto.SeasonDTO;
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

//	@RequestMapping(method = RequestMethod.GET)
//	public ResponseEntity<ResponseEntity<List<Season>>> findAll() {
//		ResponseEntity<List<Season>> listSeason = seasonService.findAll();
//		return ResponseEntity.ok().body(listSeason);
//	}
	
	@RequestMapping(method = RequestMethod.GET)
	public Page<SeasonDTO> findAll(Pageable pageable) {
		return seasonService.findAll(pageable);
	}

}
