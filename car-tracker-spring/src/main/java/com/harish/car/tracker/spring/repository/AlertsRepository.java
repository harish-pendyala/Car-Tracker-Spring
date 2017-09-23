package com.harish.car.tracker.spring.repository;

import java.util.List;

import com.harish.car.tracker.spring.entity.Alert;

public interface AlertsRepository {
	public List<Alert> findAll();
	public List<Alert> findAlerts(String vin);
	public void createAlert(Alert alert);


}
