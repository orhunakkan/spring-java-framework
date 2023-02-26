package com.example.Spring01CoreIoC.stereotype_annotation;

import com.example.Spring01CoreIoC.bean_annotation.ConfigApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunApp {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);
        context.getBean(LearningSelenium.class).learnSelenium();
        context.getBean(LearningJava.class).learnJava();
        context.getBean(LearningAgile.class).learnAgile();

        ((AnnotationConfigApplicationContext)context).close();

    }
}
