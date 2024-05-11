package com.ebaad.ProductManagementApp_WithSpring;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // Spring automatically creates object for us
public class Product_Service {
	
	@Autowired
	ProductDAO db;

	// Method to display all products from database
	public List<Product> showProducts() {
		return db.findAll();
	}
	
	
//	// Method to add the product in a list
//	public void addProduct(Product p) {
//		list.add(p);
//	}
	
	
//	// Method to search for a particular product
//	public Product searchProduct(String name) {
//		for(Product p : list) {
//			if (p.getName().equals(name)) {
//				return p;
//			}
//		}
//		return null;
//	}
	
}
