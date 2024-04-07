package com.ebaad.SpringBootAutowireDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
      /*
      ApplicationContext is an interface in Spring for providing configuration information to the application and managing the 
      beans(objects)that make up the application. ApplicationContext will simply create a spring container for you inside JVM. in
      Spring Container you have beans(class with setters getters). So we have our objects inside this container and when user
      use getBeans() method it retrieves or provides an instance of a bean from the container. The getBeans() belongs to
      ApplicationContext() interface, so we need the object of it
      */
    	ApplicationContext context = SpringApplication.run(App.class, args);
        Cars cars = context.getBean(Cars.class);
        
        cars.sale();
    }
}

