package com.productapp.product;

public class Product {
	private String name;
	private String type;
	private int warranty;
	
	// Constructor
	public Product(String name, String type, int warranty, boolean regularItem) {
		this.name=name;
		this.type=type;
		this.warranty=warranty;
	}
	
	// Setters and Getters
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setType(String type) {
		this.type=type;
	}
	public String getType() {
		return type;
	}
	
	public void setWarranty(int warranty) {
		this.warranty=warranty;
	}
	public int getWarranty() {
		return warranty;
	}

	@Override
	public String toString() {
		return "Product [ Name:   " + name + ", Type:   " + type + ", Warranty:   " + warranty + "]";
	}
	
}
