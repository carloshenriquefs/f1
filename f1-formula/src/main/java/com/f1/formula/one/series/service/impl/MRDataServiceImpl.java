package com.f1.formula.one.series.service.impl;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.f1.formula.one.series.domain.MRData;
import com.f1.formula.one.series.service.MRDataService;

@Service
public class MRDataServiceImpl implements MRDataService {

	@Override
	public ResponseEntity<List<MRData>> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
