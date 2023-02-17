package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Springboot0310TimeTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot0310TimeTaskApplication.class, args);
    }

}
