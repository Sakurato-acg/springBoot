package com.itheima.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    //创建记录对象
    private static final Logger log= LoggerFactory.getLogger(BookController.class);

    @GetMapping
    public String geById(){
        System.out.println("running");

        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");

        return "running";
    }
}
