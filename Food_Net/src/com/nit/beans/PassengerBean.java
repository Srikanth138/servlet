package com.nit.beans;

public class PassengerBean {
	private String name;
	private String sourceLocation;
	private String destinationLocation;
	private String pickUpTime;
	private int taxiId;
	
	public int getTaxiId() {
		return taxiId;
	}
	public void setTaxiId(int taxiId) {
		this.taxiId = taxiId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSourceLocation() {
		return sourceLocation;
	}
	public void setSourceLocation(String sourceLocation) {
		this.sourceLocation = sourceLocation;
	}
	public String getDestinationLocation() {
		return destinationLocation;
	}
	public void setDestinationLocation(String destinationLocation) {
		this.destinationLocation = destinationLocation;
	}
	public String getPickUpTime() {
		return pickUpTime;
	}
	public void setPickUpTime(String pickUpTime) {
		this.pickUpTime = pickUpTime;
	}
	
	

}
