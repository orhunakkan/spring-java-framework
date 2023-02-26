package com.example.Spring01CoreIoC.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class RunApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);

        FullTimeMentor fullTimeMentor = container.getBean("fullTimeMentor", FullTimeMentor.class); // fullTimeMentor is the name of the bean
        fullTimeMentor.createAccount(); // Full Time Mentor Account is created...

        PartTimeMentor partTimeMentor1 = container.getBean("partTimeMentor1", PartTimeMentor.class); // partTimeMentor1 is the name of the bean
        partTimeMentor1.createAccount(); // Part Time Mentor Account is created...

        PartTimeMentor partTimeMentor2 = container.getBean("partTimeMentor2", PartTimeMentor.class); // partTimeMentor2 is the name of the bean
        partTimeMentor2.createAccount(); // Part Time Mentor Account is created...

        ((AbstractApplicationContext)container).close();

    }
}
