package com.example.Spring02CoreWiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCarApp {

    @Bean
    Car car1() {
        Car car = new Car();
        car.setMake("Toyota");
        return car;
    }

    // Direct wiring
    // @Bean
    // Person person1() {
    //     Person person = new Person();
    //     person.setName("Orhun");
    //     person.setCar(car1());
    //     return person;
    // }

    // Autowiring
    @Bean()
    Person person1(Car car1) {
        Person person = new Person();
        person.setName("Orhun");
        person.setCar(car1);
        return person;
    }
}
