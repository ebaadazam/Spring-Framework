package com.ebaad.SpringSingletonOrPrototypeScope;

public class Cars {
	private String brand;
	private String model;
	private int year;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Cars [brand=" + brand + ", model=" + model + ", year=" + year + "]";
	}

}

