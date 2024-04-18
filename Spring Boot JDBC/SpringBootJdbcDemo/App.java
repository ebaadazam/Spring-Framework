package com.ebaad.SpringJdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ebaad.SpringJdbc.model.Car;
import com.ebaad.SpringJdbc.repository.CarRepository;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);
        Car car = (Car) context.getBean(Car.class);
        
        car.setModelName("Aston Martin DB12");
        car.setModelNo(1111);
        
        CarRepository carRepo = context.getBean(CarRepository.class);
        carRepo.save(car);
        System.out.println(carRepo.findAll());
    }
}

