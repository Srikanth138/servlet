package com.nit.beans;

import java.sql.Timestamp;

public class TaxiDriverBean {
	private int id;
	private String name;
	private String phone;
	private String email;
	private String currentLocation;
	private Timestamp pickUpTime;
	private Timestamp dropTime;
	private String source;
	private String destination;
	
	
	
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Timestamp getDropTime() {
		return dropTime;
	}

	public void setDropTime(Timestamp dropTime) {
		this.dropTime = dropTime;
	}

	public Timestamp getPickUpTime() {
		return pickUpTime;
	}

	public void setPickUpTime(Timestamp pickUpTime) {
		this.pickUpTime = pickUpTime;
	}

	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCurrentLocation() {
		return currentLocation;
	}
	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}
	
	

}
