package com.ebaad.ProductManagementApp_WithSpring;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProductManagementAppWithSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProductManagementAppWithSpringApplication.class, args);
		
		Product_Service service = context.getBean(Product_Service.class);
		
		List<Product> list = service.showProducts();
		for(Product p : list) {
			System.out.println(p);
		}
	}

}
