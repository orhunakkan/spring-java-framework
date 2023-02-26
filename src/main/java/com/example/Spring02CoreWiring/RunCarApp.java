package com.example.Spring02CoreWiring;

import com.example.Spring01CoreIoC.bean_annotation.ConfigApp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunCarApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);

        Person person = container.getBean(Person.class);
        Car car = container.getBean(Car.class);

        System.out.println(person.getName());
        System.out.println(car.getMake());
        System.out.println(person.getCar().getMake());

        ((AnnotationConfigApplicationContext) container).close();
        

    }
}
