package com.harish.car.tracker.spring.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.harish.car.tracker.spring.entity.Vehicle;
import com.harish.car.tracker.spring.exception.NotFoundException;
import com.harish.car.tracker.spring.repository.VehicleRepository;
import com.harish.car.tracker.spring.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService{
	
	private VehicleRepository repository;
	public VehicleServiceImpl(VehicleRepository repository) {
		this.repository = repository;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Vehicle> findAll() {
		return repository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Vehicle findOne(String vin) {
		Vehicle existing = repository.findOne(vin);
		if (existing == null){
			throw new NotFoundException("Vehicle with vin "+ vin + "does not exist");
		}
		return existing;
	}

    public void loadVehicles(Vehicle[] vehicles) {
        for(Vehicle vehicle : vehicles) {
        	
            Vehicle v = repository.findOne(vehicle.getVin());
            if(v == null) {
                createVehicle(vehicle);
            } else {
                updateVehicle(vehicle);
            }
        }
    }
    
    @Override
    public void createVehicle(Vehicle vehicle) {
        repository.createVehicle(vehicle);
        
     }

	@Override
	public Vehicle updateVehicle(Vehicle vehicle) {
		
		return repository.updateVehicle(vehicle);
	}

}
