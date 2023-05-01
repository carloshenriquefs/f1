package com.f1.formula.one.series.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.f1.formula.one.series.repositories.MRDataRepository;
import com.f1.formula.one.series.service.MRDataService;

@Service
public class MRDataServiceImpl implements MRDataService {

	@Autowired
	private MRDataRepository mrDataRepository;
}
