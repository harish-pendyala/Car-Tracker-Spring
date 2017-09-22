package com.harish.car.tracker.spring.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.harish.car.tracker.spring.entity.Vehicle;
import com.harish.car.tracker.spring.repository.VehicleRepository;

@Repository
public class VehicleRepositoryImpl implements VehicleRepository {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional(readOnly = true)
	public List<Vehicle> findAll() {
		TypedQuery<Vehicle> query = em.createNamedQuery("Vehicle.findAll",Vehicle.class);
		return query.getResultList();
	}


	
	@Override
	@Transactional(readOnly = true)
	public Vehicle findOne(String vin) {
		return em.find(Vehicle.class, vin);
	}


	@Override
    @Transactional
    public void createVehicle(Vehicle vehicle) {
        em.persist(vehicle);
    }



	@Override
    @Transactional
    public Vehicle updateVehicle(Vehicle vehicle) {
        return em.merge(vehicle);
    }


}
