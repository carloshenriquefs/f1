package com.f1.formula.one.series.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.f1.formula.one.series.domain.Season;
import com.f1.formula.one.series.dto.MensagemDTO;
import com.f1.formula.one.series.dto.SeasonDTO;

public interface SeasonService {
	
	Season create(Season season);

	Season findByIdSeason(Long id);
	
	Page<SeasonDTO> findAll(Pageable pageable);
	
	Optional<Season> getBySeason(String season);
	
	MensagemDTO removeSeasonById(Long id);
}
