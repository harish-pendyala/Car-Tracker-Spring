package com.harish.car.tracker.spring.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.harish.car.tracker.spring.entity.Alert;
import com.harish.car.tracker.spring.repository.AlertsRepository;

@Repository
public class AlertsRepositoryImpl implements AlertsRepository {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional(readOnly = true)
	public List<Alert> findAll() {
		TypedQuery<Alert> query = em.createNamedQuery("Alert.findAll",Alert.class);
		return query.getResultList();
	}


	
	@Override
	@Transactional(readOnly = true)
	public List<Alert> findAlerts(String vin) {
		TypedQuery<Alert> query = em.createNamedQuery("Alert.findAlerts",Alert.class);
		query.setParameter("pVin", vin);
		return query.getResultList();
	}


	@Override
    @Transactional
    public void createAlert(Alert alert) {
        em.persist(alert);
    }





}
