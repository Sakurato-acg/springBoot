package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot30StartupApplication {

    public static void main(String[] args) {
        args = new String[]{"test.value=test.value1"};
        ConfigurableApplicationContext run = SpringApplication.run(Springboot30StartupApplication.class, args);
//        Properties properties = System.getProperties();
//        properties.list(System.out);
    }

}
