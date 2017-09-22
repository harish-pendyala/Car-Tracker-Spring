package com.harish.car.tracker.spring.repository;

import java.util.List;

import com.harish.car.tracker.spring.entity.Reading;

public interface ReadingsRepository {
	public List<Reading> findAll();
	public List<Reading> findReadings(String vin);
	public Reading addReading(Reading reading);


}
