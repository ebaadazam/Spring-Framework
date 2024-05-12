package com.ebaad.ProductManagementAppMVCSpring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// The Controller is used only for accepting the request, process it and sending the response

@RestController
public class ProductController {
	
	@Autowired
	Product_Service service;
	
	// Fetching all products
	@GetMapping("/products")
	public List<Product> getProducts() {
		return service.showProducts();
	}
	
	// Fetching a single product by name
	@GetMapping("/product/{name}")
	public Product getProduct(@PathVariable String name) {
		return service.searchProduct(name);
	}
	
	// Sending Post Request through postman i.e, adding the data in json format
	@PostMapping("/product")
	public void addProduct(@RequestBody Product p) {
		service.addProduct(p);
	}
	
	// Getting the counts of the products
	@GetMapping("/count")
	public Long countProduct() {
		return service.countProduct();
	}
}
