package com.itheima;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class Springboot0313AdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot0313AdminServerApplication.class, args);
    }

}
