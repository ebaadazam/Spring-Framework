package com.ebaad.SpringConstructorInjection;

public class LuxuryCar {
	private float safetyrating; 
	
	// Constructor
	public LuxuryCar(float safetyrating) {
		this.safetyrating=safetyrating;
	}

	// Setters and Getters
	public float getSafetyrating() {
		return safetyrating;
	}
	public void setSafetyrating(float safetyrating) {
		this.safetyrating = safetyrating;
	}
	
	@Override
	public String toString() {
		return "The Luxury Car has a good safety rating of about " + safetyrating;
	}

}

