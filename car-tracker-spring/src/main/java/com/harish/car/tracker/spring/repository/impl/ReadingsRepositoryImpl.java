package com.harish.car.tracker.spring.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.harish.car.tracker.spring.entity.Reading;
import com.harish.car.tracker.spring.repository.ReadingsRepository;

@Repository
public class ReadingsRepositoryImpl implements ReadingsRepository {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional(readOnly = true)
	public List<Reading> findAll() {
		TypedQuery<Reading> query = em.createNamedQuery("Reading.findAll",Reading.class);
		return query.getResultList();
	}


	
	@Override
	@Transactional(readOnly = true)
	public List<Reading> findReadings(String vin) {
		TypedQuery<Reading> query = em.createNamedQuery("Reading.findReadings",Reading.class);
		query.setParameter("pVin", vin);
		return query.getResultList();
	}


	@Override
    @Transactional
    public Reading addReading(Reading reading) {
        em.persist(reading.getTires());
        em.persist(reading);
        return reading;
    }





}
