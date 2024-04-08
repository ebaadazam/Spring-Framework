package com.ebaad.SpringSingletonOrPrototypeScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Cars car = (Cars) context.getBean("obj");
        
        // here we are setting the values for the object named "car"
        car.setBrand("Porsche");
        car.setModel("911 GT4 RS");
        car.setYear(2022);
        System.out.println(car.getBrand() + " " + car.getModel());
        
        /* When we create another object "car2" then the values we set for "car" object will be the same 
         * for "car2" as well. This is because the scope is singleton where the object will only be created
         * once. 
         * If we even create two references both of the references will be pointing to the same object
         * By Default, the scope is singleton. We can either specify the scope using XML Configuration or
         * Java based Configuration using annotations
         * As this is just a simple spring project so we mentioned the scope in the XML file
        */
        Cars car2 = (Cars) context.getBean("obj");
        System.out.println(car2.getBrand() + " " + car2.getModel());
        /*
         * We set the Brand and Model for the first object as "Porsche 911 GT4 RS". If we create the second
         * object, the value be also be "Porsche 911 GT4 RS" for the second object in singleton scope.
         * But in case of Prototype Scope if we set the value for Brand and Model for the first object as 
         * "Porsche 911 GT4 RS" and if we create the second object then value for the Brand and Model for the
         * second object will be null as we did not provide any
         * */
        
        
    }
}

