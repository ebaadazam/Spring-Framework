package com.ebaad.SpringBootAutowireDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/*
 * When we use the annotation @Component then Spring Framework is responsible for creating the object of
 * Cars using getBeans(). @Component is a Spring annotation used to indicate that a Java class is a Spring
 * component. Spring components are Java classes managed by the Spring IoC (Inversion of Control) container.
 * */
@Component
public class Cars {
	
	@Autowired //@Autowired in Spring tells Spring to automatically provide the necessary objects(dependencies) when it creates an instance(merc in this case) of a class. 
	Mercedes merc;
	
	private String brand;
	private String model;
	private int year;
	private int kmsDriven;
	
	public void sale() {
		System.out.println("The value of the Car is basically determined by the brand, model, year and kmsdriven");
	    merc.speedAndGears();
	}

}
