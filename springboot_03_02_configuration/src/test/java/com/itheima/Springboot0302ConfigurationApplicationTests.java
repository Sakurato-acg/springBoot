package com.itheima;

import com.itheima.config.ServletConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot0302ConfigurationApplicationTests {

//    @Autowired
//    @ConfigurationProperties(prefix = "spring.datasource")
    @Value("${spring.datasource.password}")
    private int password;
//    private DruidDataSource dataSource;

//    @Value("${server.port}")
//    private int port;


    @Test
    void contextLoads() {
//        System.out.println("port = " + port);
        System.out.println(password);
    }


    @Autowired
    private ServletConfig servletConfig;

    @Test
    void get(){
        System.out.println("servletConfig = " + servletConfig);
    }
}
