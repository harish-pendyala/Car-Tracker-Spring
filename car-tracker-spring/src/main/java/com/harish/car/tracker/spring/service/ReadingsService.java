package com.harish.car.tracker.spring.service;

import java.util.List;

import com.harish.car.tracker.spring.entity.Reading;

public interface ReadingsService {
	
	public List<Reading> findAll();
	
	public List<Reading> findReadings(String vin);
	
	public Reading addReading(Reading reading);

    
}
