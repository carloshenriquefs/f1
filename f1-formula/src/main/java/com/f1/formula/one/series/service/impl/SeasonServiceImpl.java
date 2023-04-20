package com.f1.formula.one.series.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.f1.formula.one.series.domain.Season;
import com.f1.formula.one.series.repositories.SeasonRepository;
import com.f1.formula.one.series.service.SeasonService;

@Service
public class SeasonServiceImpl implements SeasonService {

	@Autowired
	private SeasonRepository SeasonRepository;
	
	@Override
	public Season findByIdSeason(Long id) {
		Optional<Season> optionalSeason = SeasonRepository.findById(id);
		return optionalSeason.orElse(null);
	}

	@Override
	public ResponseEntity<List<Season>> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
