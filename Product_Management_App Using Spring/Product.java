package com.ebaad.ProductManagementApp_WithSpring;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Mark it as table
public class Product {
	@Id //Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; // Use a numeric type for the primary key
	private String name;
	private String type;
	private int warranty;
	@Column(name = "regularItem")
	private boolean regularItem;
	
	// Default constructor required by JPA
    public Product() {
    }
	
	// Constructor
	public Product(String name, String type, int warranty, boolean regularItem, int id) {
		this.name=name;
		this.id=id;
		this.type=type;
		this.warranty=warranty;
		this.regularItem=regularItem;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	public void setRegularItem(boolean regularItem) {
		this.regularItem=regularItem;
	}
	public boolean getRegularItem() {
		return regularItem;
	}

	@Override
    public String toString() {
        return "Product [Id: " + id + ", Name: " + name + ", Type: " + type + ", Warranty: " + warranty + ", RegularItem: " + regularItem + "]";
    }
	
}
