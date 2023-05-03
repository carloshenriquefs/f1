package com.f1.formula.one.series.service;

import java.util.List;

import com.f1.formula.one.series.domain.MRData;
import com.f1.formula.one.series.dto.MRDataDTO;

public interface MRDataService {

	List<MRDataDTO> findAll();
	
	MRData findByIdMRData(Long id);
}
