package model.entities;

public class Vehicle {
	
	private String model;

	//constructors
	public Vehicle() {
	}
	
	public Vehicle(String model) {
		this.model = model;
	}

	//getters setters
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}		
}
