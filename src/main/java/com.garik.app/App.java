package com.garik.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
@EnableAutoConfiguration
@ComponentScan
public class App {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(App.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");


    }


}
