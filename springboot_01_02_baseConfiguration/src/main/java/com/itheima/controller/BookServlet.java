package com.itheima.controller;

import com.itheima.MyDatasource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookServlet {

    @Value("${server.port}")
    private Integer port;
    @Value("${user.name}")
    private String name;


    @Autowired
    private MyDatasource myDatasource;

    @GetMapping
    public String getById() {
        return  port.toString();
//        return "getId";
//        return myDatasource;
    }
}
