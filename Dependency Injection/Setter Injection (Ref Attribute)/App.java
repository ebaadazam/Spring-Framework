package com.ebaad.SpringSetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/* Setter injection in Spring Framework is a form of dependency injection where the framework injects
   dependencies into an object through the object's setter methods. */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Cars obj = (Cars) context.getBean("cars"); 
        obj.drive();
    }
}

