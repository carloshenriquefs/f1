package com.f1.formula.one.series.service.impl;

import static com.f1.formula.one.series.constants.Constants.MRDATA_NAO_ENCONTRADO;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.f1.formula.one.series.domain.MRData;
import com.f1.formula.one.series.dto.MRDataDTO;
import com.f1.formula.one.series.exception.ObjectNotFoundException;
import com.f1.formula.one.series.repositories.MRDataRepository;
import com.f1.formula.one.series.service.MRDataService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MRDataServiceImpl implements MRDataService {

	@Autowired
	private MRDataRepository mrDataRepository;

	private final ModelMapper modelMapper = new ModelMapper();

	public MRData create(MRData mrData) {
		return mrDataRepository.save(mrData);
	}

	public List<MRDataDTO> findAll() {
		return mrDataRepository.findAll().stream().map(p -> modelMapper.map(p, MRDataDTO.class))
				.collect(Collectors.toList());
	}

	public MRData findByIdMRData(Long id) {
		Optional<MRData> optionalMRData = mrDataRepository.findById(id);
		return optionalMRData.orElseThrow(() -> new ObjectNotFoundException(MRDATA_NAO_ENCONTRADO));
	}

}
