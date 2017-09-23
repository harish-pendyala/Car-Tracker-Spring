package com.harish.car.tracker.spring.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.harish.car.tracker.spring.entity.Alert;
import com.harish.car.tracker.spring.exception.NotFoundException;
import com.harish.car.tracker.spring.repository.AlertsRepository;
import com.harish.car.tracker.spring.service.AlertsService;

@Service
public class AlertsServiceImpl implements AlertsService{
	
	private AlertsRepository repository;
	public AlertsServiceImpl(AlertsRepository repository) {
		this.repository = repository;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Alert> findAll() {
		return repository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Alert> findAlerts(String vin) {
		return repository.findAlerts(vin);
	}


	@Override
	public void createAlert(Alert alert) {
		repository.createAlert(alert);
		
	}

}
