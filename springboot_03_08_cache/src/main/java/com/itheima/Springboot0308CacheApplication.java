package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Springboot0308CacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot0308CacheApplication.class, args);
    }

}
