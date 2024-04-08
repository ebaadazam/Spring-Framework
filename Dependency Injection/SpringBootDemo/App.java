
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
      beans(objects)that make up the application. ApplicationContext will simply create a spring container for you inside JVM. in
      Spring Container you have beans(class with setters getters). So we have our objects inside this container and when user
      use getBeans() method it retrieves or provides an instance of a bean from the container. The getBeans() belongs to
      ApplicationContext() interface, so we need the object of it
      */
    
    	ApplicationContext context = SpringApplication.run(App.class, args); // run() method is a static method provided by the 
        // SpringApplication class. It is used to start a Spring Boot application and gives you the object of ApplicationContext.
    	
    	Cars cars = context.getBean(Cars.class); // getBeans() provide you the object of the class
    	// above if you seee we have not use the "new" keyword to initialze the object of Cars class as spring will do it for us 
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

