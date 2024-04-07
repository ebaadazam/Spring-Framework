package com.ebaad.SpringBootAutowireDemo;

import org.springframework.stereotype.Component;

/*
 * When we use the annotation @Component then Spring Framework is responsible for creating the object of
 * Cars using getBeans(). @Component is a Spring annotation used to indicate that a Java class is a Spring
 * component. Spring components are Java classes managed by the Spring IoC (Inversion of Control) container.
 * */
@Component
public class Mercedes {
	
	private int currentSpeed;
	private int maxSpeed;
	private int noOfGears;
	
	public Mercedes() {
		currentSpeed = 0;
		maxSpeed = 400;
		noOfGears = 5;
	}
	
	public void speedAndGears() {
		System.out.println("The Mercedes has "+ noOfGears + " gears in total, Maximum Speed as " + maxSpeed + " and its current speed is " + currentSpeed);
	}
}
