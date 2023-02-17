package com.itheima;

import com.itheima.controller.BookServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot0101QuickStartApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Springboot0101QuickStartApplication.class, args);
        BookServlet bean = run.getBean(BookServlet.class);
        System.out.println(bean);
    }

}
