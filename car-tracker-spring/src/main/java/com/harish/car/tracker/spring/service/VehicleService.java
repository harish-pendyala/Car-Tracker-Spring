package com.harish.car.tracker.spring.service;

import java.util.List;

import com.harish.car.tracker.spring.entity.Vehicle;

public interface VehicleService {
	
	public List<Vehicle> findAll();
	
	public Vehicle findOne(String vin);
	
	public void loadVehicles(Vehicle[] vehicles);
	
	public void createVehicle(Vehicle vehicle);

    public Vehicle updateVehicle(Vehicle vehicle);

    
}
