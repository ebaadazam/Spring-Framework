package com.productapp.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.productapp.product.Product;

// In this Product_Service Class, we are going to write the logic for adding the product and retrieving the product and many more operations.
// This class is responsible to delegate the work
public class Product_Service {
	
	// Creating a list which will contain the products
	List<Product> list = new ArrayList<Product>();
	
	// Method to add the product in a list
	public void addProduct(Product p) {
		list.add(p);
	}
	

	// Method to remove a product
	public void removeProd(String name) {
		// Using an Iterator to remove the product from the list
		Iterator<Product> iterator = list.iterator();
		while (iterator.hasNext()) {
			Product p = iterator.next();
			if (p.getName().equals(name)) {
				iterator.remove();
				break;
			}
		}
	}
	
	
	// Method to show the list of all products
	public List<Product> showProducts() {
		return list; 
	}
	
	
	// Method to search for a particular product
	public Product searchProduct(String name) {
		for(Product p : list) {
			if (p.getName().equals(name)) {
				return p;
			}
		}
		return null;
	}
	
	
	// Method to search for a product through warranty
	public List<Product> showWarranty(int warranty) {
		List<Product> warrantyProd = new ArrayList<Product>(); // This will hold the filtered products
		for(Product p : list) { // Assuming 'list' is the field containing all products
			if (p.getWarranty() == warranty) {
				warrantyProd.add(p);
			}
		}
		return warrantyProd;
	}
	
	
	// Method to show the number of products available
	public int showCount() {
		return list.size();
	}
}
