package com.harish.car.tracker.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
    @NamedQuery(name = "Vehicle.findAll",
                query = "SELECT v FROM Vehicle v")
})
public class Vehicle {
	
	@Id
	private String vin;
	private String make;
	private String model;
	private String year;
	private String redlineRpm;
	private String maxFuelVolume;
	private String lastServiceDate;
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getRedlineRpm() {
		return redlineRpm;
	}
	public void setRedlineRpm(String redlineRpm) {
		this.redlineRpm = redlineRpm;
	}
	public String getMaxFuelVolume() {
		return maxFuelVolume;
	}
	public void setMaxFuelVolume(String maxFuelVolume) {
		this.maxFuelVolume = maxFuelVolume;
	}
	public String getLastServiceDate() {
		return lastServiceDate;
	}
	public void setLastServiceDate(String lastServiceDate) {
		this.lastServiceDate = lastServiceDate;
	}
	@Override
	public String toString() {
		return "Vehicle [vin=" + vin + ", make=" + make + ", model=" + model + ", year=" + year + ", redlineRpm="
				+ redlineRpm + ", maxFuelVolume=" + maxFuelVolume + ", lastServiceDate=" + lastServiceDate + "]";
	}

	
	

}
