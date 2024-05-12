// This is a Product Management App where we manage the products available with us and perform certain
// operations such as adding the product, removing a product, searching for a product, filtering the
// product by name or warranty, get the count of number of products. This is a Console-Based Application.
// The Output is showing on the console instead of any webpage and no database is used in this

package com.productapp;

import java.util.List;

import com.productapp.product.Product;
import com.productapp.service.Product_Service;

public class Main {
	public static void main(String[] args) {
		Product_Service service = new Product_Service();
		service.addProduct(new Product("MacBook Pro", "Laptop", 5, true));
		service.addProduct(new Product("Asus Chromebook", "Laptop", 3, true));
		service.addProduct(new Product("Samsung Galaxy M32", "Mobile Phone", 2, true));
		service.addProduct(new Product("Logitech Wireless Mouse", "Mouse", 1, true));
		service.addProduct(new Product("iPhone 15 Pro", "Mobile Phone", 4, true));
		service.addProduct(new Product("Dell Inspiron", "Laptop", 3, false));
		service.addProduct(new Product("Type-C", "Cable", 1, true));
		service.addProduct(new Product("Lenovo IdeaPad", "Laptop", 3, false));
		service.addProduct(new Product("Logitech Wireless Keyboard", "Keyboard", 1, true));
		service.addProduct(new Product("Canon R100 Mirrorless Camera", "Camera", 5, false));
		service.addProduct(new Product("Sony Bravia Smart LED TV", "Television", 5, false));
		service.addProduct(new Product("Boat Rockerz 450", "HeadPhone", 2, true));
		service.addProduct(new Product("Boat Airdopes 181", "HeadPhone", 1, false));
		
		// Getting a list of products
		List<Product> prod = service.showProducts();
		for(Product p : prod) {
			System.out.println(p);
		}
		System.out.println("================================================================");
		
		
		// Searching for a particular product by name
		Product p = service.searchProduct("MacBook Pro"); // storing it in a object of type Product
		System.out.println(p);
		System.out.println("================================================================");
		
		// Searching for a particular product through warranty
		List<Product> warr = service.showWarranty(5); // storing it in a object of type List<Product> as it will return us the list of certain items with that particular warranty
		for(Product prWarranty : warr) {
			System.out.println(prWarranty);
		}
		System.out.println("================================================================");
		
	
	    // Getting the count of the products
		int countProd = service.showCount();
		System.out.println("The Number of Products available is: " + countProd);
		System.out.println("================================================================");
		
		
		service.removeProd("Type-C"); // removing a product from the list
		// printing the list after removing
		List<Product> prod2 = service.showProducts();
		for(Product p2 : prod2) {
			System.out.println(p2);
		}
		System.out.println("================================================================");
	
	}

}
