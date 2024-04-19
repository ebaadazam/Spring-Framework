package com.ebaad.SpringMVC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringMvcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringMvcApplication.class, args);
		System.out.println("Nothing, Just prints on the Console");
	}
}

