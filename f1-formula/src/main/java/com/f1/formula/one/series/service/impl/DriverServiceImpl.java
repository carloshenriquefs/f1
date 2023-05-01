package com.f1.formula.one.series.service.impl;

import static com.f1.formula.one.series.constants.Constants.DRIVER_EXCLUIDO_COM_SUCESSO;
import static com.f1.formula.one.series.constants.Constants.DRIVER_INEXISTENTE;
import static com.f1.formula.one.series.constants.Constants.DRIVER_NAO_ENCONTRADO;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.f1.formula.one.series.domain.Driver;
import com.f1.formula.one.series.dto.DriverDTO;
import com.f1.formula.one.series.exception.ObjectNotFoundException;
import com.f1.formula.one.series.message.Message;
import com.f1.formula.one.series.repositories.DriverRepository;
import com.f1.formula.one.series.service.DriverService;

@Service
public class DriverServiceImpl implements DriverService {

	@Autowired
	private DriverRepository driverRepository;

	@Override
	public Driver create(Driver driver) {
		return driverRepository.save(driver);
	}

	@Override
	public Driver findByIdDriver(Long id) {
		Optional<Driver> optionalDriver = driverRepository.findById(id);
		return optionalDriver.orElseThrow(() -> new ObjectNotFoundException(DRIVER_NAO_ENCONTRADO));
	}

	@Override
	public Page<DriverDTO> findAll(Pageable pageable) {
		Page<Driver> result = driverRepository.findAll(pageable);
		Page<DriverDTO> page = result.map(x -> new DriverDTO(x));
		return page;
	}

	@Override
	public Optional<Driver> getByDriver(String driver) {
		return driverRepository.findByDriver(driver);
	}

	@Override
	public Optional<Driver> getByGivenName(String givenName) {
		return driverRepository.findByGivenName(givenName);
	}

	@Override
	public Message removeDriverById(Long id) {
		if (driverRepository.existsById(id)) {
			driverRepository.deleteById(id);
			return new Message(DRIVER_EXCLUIDO_COM_SUCESSO);
		}
		return new Message(DRIVER_INEXISTENTE);
	}

	@Override
	public DriverDTO updateDriver(Long id, DriverDTO driver) {
		// TODO Auto-generated method stub
		return null;
	}


}
