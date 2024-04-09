package com.ebaad.SpringSetterInjection;

public class Cars {
	// The variable of type SportsCar
	private SportsCar sports;
	
	// Method
	public void drive() {
		System.out.println("A normal car can drive smoothly");
		sports.speed(); // calling the method of SportsCar
	}
	
	// Setters and Getters
	public SportsCar getSports() {
		return sports;
	}
	public void setSports(SportsCar sports) {
		this.sports = sports;
	}
}

