package com.harish.car.tracker.spring.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.harish.car.tracker.spring.entity.Reading;
import com.harish.car.tracker.spring.exception.NotFoundException;
import com.harish.car.tracker.spring.repository.ReadingsRepository;
import com.harish.car.tracker.spring.service.ReadingsService;

@Service
public class ReadingsServiceImpl implements ReadingsService{
	
	private ReadingsRepository repository;
	public ReadingsServiceImpl(ReadingsRepository repository) {
		this.repository = repository;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Reading> findAll() {
		return repository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Reading> findReadings(String vin) {
		return repository.findReadings(vin);
	}


	@Override
	public Reading addReading(Reading reading) {
		return repository.addReading(reading);
		
	}

}
