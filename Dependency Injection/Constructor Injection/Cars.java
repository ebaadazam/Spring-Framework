package com.ebaad.SpringConstructorInjection;

public class Cars {
	
	private int milleage;
	
	// LuxuryCar Class Object
	private LuxuryCar luxury;
	
	// Constructor
	public Cars(int milleage, LuxuryCar luxury) {
		this.milleage = milleage;
		this.luxury = luxury;
	}
	
	// Setters and getters
	public void setMilleage(int milleage) {
		this.milleage=milleage;
	}
	public LuxuryCar getLuxury() {
		return luxury;
	}
	public void setLuxury(LuxuryCar luxury) {
		this.luxury = luxury;
	}
	public int getMilleage() {
		return milleage;
	}

	@Override
	public String toString() {
		return "The milleage of the Car is " + milleage + ". And the luxury car does not care about milleage but it has a safety ratings of about " + luxury.getSafetyrating();
	}
}

