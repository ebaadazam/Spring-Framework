package com.productapp.Product_Management_AppDB;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// This is a Service Class to delegate the work
public class Product_Service {
	
	// Creating object of ProductDAO
	ProductDAO dao = new ProductDAO();
	
	// Method to add the product in a list
	public void addProduct(Product p) {
		dao.save(p);
	}
	
	
	// Method to show the list of all products
	public List<Product> showProducts() {
		return dao.show(); 
	}
	
	
	// Method to search for a particular product
	public Product searchProduct(String name) {
		return dao.showOne(name);
	}
	
	
	// Method to delete a product
	public Product deleteProduct(String name) {
		return dao.delete(name);
	}
	
}
