package com.example.Spring01CoreIoC.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigApp {

    @Bean
    FullTimeMentor fullTimeMentor() {
        return new FullTimeMentor();
    }

    @Bean(name = "partTimeMentor1") 
    @Primary
        // if there are multiple beans of the same type, this bean will be used
    PartTimeMentor partTimeMentor1() {
        return new PartTimeMentor();
    }

    // @Bean(name = "partTimeMentor2")
    @Bean
    PartTimeMentor partTimeMentor2() {
        return new PartTimeMentor();
    }

}
