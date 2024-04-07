package com.ebaad.SpringFW;

import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication  // annotation in Spring Boot that simplifies the configuration and setup of Spring applications, enabling
// you to quickly create and deploy applications with minimal configuration.
public class App {
    public static void main(String[] args) {

      /*
      ApplicationContext is an interface in Spring for providing configuration information to the application and managing the 
      beans(objects)that make up the application. ApplicationContext will simply create a spring container for you inside JVM
      */
    	// getBeans() belongs to an interface called ApplicationContext(), so we need the object of it
    	ApplicationContext context = SpringApplication.run(App.class, args); // run() method returns the object
    	// of Configuration Application Context i.e, it gives the object of ApplicationContext
    	
    	Cars cars = context.getBean(Cars.class); // getBeans() gives you the object of the class, and we do not just
    	// use the new keyword to initialize the object like we do as Spring will do it for us
    	Cars cars2 = context.getBean(Cars.class); //bean is requested again so create new instance
    	
    	List<Cars> listOfCars = new ArrayList();
    	cars.setBrand("Audi");
    	cars.setModel("R8 V10 Spyder");
    	cars.setYear(2020);
    	cars2.setBrand("Merc");
    	cars2.setModel("Maybach S680");
    	cars2.setYear(2023);
    	
    	listOfCars.add(cars);
    	listOfCars.add(cars2);
    	
        for(Cars c : listOfCars) {
        	System.out.println(c);
        }
    }
}

