package com.example.Spring03CoreDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunHoursApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigHoursApp.class);
        Java java = container.getBean(Java.class);
        java.getTeachingHours();

        ((AnnotationConfigApplicationContext) container).close();

    }
}
