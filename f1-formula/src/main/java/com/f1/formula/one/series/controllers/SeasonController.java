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

import com.f1.formula.one.series.domain.Season;
import com.f1.formula.one.series.dto.MensagemDTO;
import com.f1.formula.one.series.dto.SeasonDTO;
import com.f1.formula.one.series.service.SeasonService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/seasons")
public class SeasonController {

	@Autowired
	private SeasonService seasonService;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Season> create(@RequestBody @Valid Season season) {
		Season seasonCreated = seasonService.create(season);
		return ResponseEntity.status(HttpStatus.CREATED).body(seasonCreated);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Season> findById(@PathVariable Long id) {
		Season Season = seasonService.findByIdSeason(id);
		return ResponseEntity.ok(Season);
	}

	@RequestMapping(method = RequestMethod.GET)
	public Page<SeasonDTO> findAll(Pageable pageable) {
		return seasonService.findAll(pageable);
	}

	@RequestMapping(value = "/season/{season}", method = RequestMethod.GET)
	public ResponseEntity<Season> getBySeason(@PathVariable("season") String season) {
		return seasonService.getBySeason(season).map(s -> ResponseEntity.ok(s))
				.orElseGet(() -> ResponseEntity.notFound().build());
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public MensagemDTO removeSeason(@PathVariable Long id) {
		return seasonService.removeSeasonById(id);
	}
}
