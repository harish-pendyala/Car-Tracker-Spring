package com.harish.car.tracker.spring.repository;

import java.util.List;

import com.harish.car.tracker.spring.entity.Vehicle;

public interface VehicleRepository {
	public List<Vehicle> findAll();
	public Vehicle findOne(String id);
	public void createVehicle(Vehicle vehicle);
	public Vehicle updateVehicle(Vehicle vehicle);


}
