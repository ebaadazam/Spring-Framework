package com.ebaad.ProductManagementAppMVCSpring;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component // Spring automatically creates object for us
public class Product_Service {
	
	@Autowired
	ProductDAO db;

	// Method to display all products from database
	public List<Product> showProducts() {
		return db.findAll(); // findAll() is an inbuilt method we got after extending JPARepository
	}
	
	
	// Method to add the product in a list
	public void addProduct(Product p) {
		db.save(p);
	}
	
	
	// Method to search for a particular product
	public Product searchProduct(String name) {
		return db.findByName(name);
	}
	
	// Method to count the products
	public Long countProduct() {
		return db.count();
	}
	
}
