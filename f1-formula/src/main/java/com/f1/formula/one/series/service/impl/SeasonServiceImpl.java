package com.f1.formula.one.series.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.f1.formula.one.series.domain.Season;
import com.f1.formula.one.series.dto.SeasonDTO;
import com.f1.formula.one.series.repositories.SeasonRepository;
import com.f1.formula.one.series.service.SeasonService;

@Service
public class SeasonServiceImpl implements SeasonService {

	@Autowired
	private SeasonRepository seasonRepository;
	
	@Override
	public Season findByIdSeason(Long id) {
		Optional<Season> optionalSeason = seasonRepository.findById(id);
		return optionalSeason.orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public Page<SeasonDTO> findAll(Pageable pageable) {
		Page<Season> result = seasonRepository.findAll(pageable);
		Page<SeasonDTO> page = result.map(x -> new SeasonDTO(x));
		return page;
	}

}
