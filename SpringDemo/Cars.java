package com.ebaad.SpringFW;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
 * When we use the annotation @Component then Spring Framework is responsible for creating the object of
 * Cars using getBeans(). @Component is a Spring annotation used to indicate that a Java class is a Spring
 * component. Spring components are Java classes managed by the Spring IoC (Inversion of Control) container.
 * */
@Component
@Scope("prototype")  // Specifies that a new instance should be created each time a bean is requested. By default, Spring manages
// beans as singletons. This means that the ApplicationContext will create and manage a single instance of the Cars class, and any
// request for a Cars bean will return the same instance.
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
		return "Brand: " + brand + ", Model: " + model + ", Year: " + year;
	}
	
}

