package com.f1.formula.one.series.service.impl;

import static com.f1.formula.one.series.constants.Constants.SEASON_NAO_ENCONTRADO;
import static com.f1.formula.one.series.constants.Constants.SEASON_EXCLUIDO_COM_SUCESSO;
import static com.f1.formula.one.series.constants.Constants.SEASON_INEXISTENTE;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.f1.formula.one.series.domain.Season;
import com.f1.formula.one.series.dto.SeasonDTO;
import com.f1.formula.one.series.exception.ObjectNotFoundException;
import com.f1.formula.one.series.message.Message;
import com.f1.formula.one.series.repositories.SeasonRepository;
import com.f1.formula.one.series.service.SeasonService;

@Service
public class SeasonServiceImpl implements SeasonService {

	@Autowired
	private SeasonRepository seasonRepository;

	@Override
	public Season create(Season season) {
		return seasonRepository.save(season);
	}

	@Override
	public Season findByIdSeason(Long id) {
		Optional<Season> optionalSeason = seasonRepository.findById(id);
		return optionalSeason.orElseThrow(() -> new ObjectNotFoundException(SEASON_NAO_ENCONTRADO));
	}

	@Override
	@Transactional(readOnly = true)
	public Page<SeasonDTO> findAll(Pageable pageable) {
		Page<Season> result = seasonRepository.findAll(pageable);
		Page<SeasonDTO> page = result.map(x -> new SeasonDTO(x));
		return page;
	}

	@Override
	public Optional<Season> getBySeason(String season) {
		return seasonRepository.findBySeason(season);
	}

	@Override
	public Message removeSeasonById(Long id) {
		if (seasonRepository.existsById(id)) {
			seasonRepository.deleteById(id);
			return new Message(SEASON_EXCLUIDO_COM_SUCESSO);
		}
		return new Message(SEASON_INEXISTENTE);
	}

}
