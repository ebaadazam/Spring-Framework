package com.ebaad.SpringConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Cars cars = (Cars) context.getBean("cars");
        System.out.println(cars); // this will call toString() method of Cars class
    }
}

