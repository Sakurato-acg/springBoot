package com.itheima.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@Slf4j
@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping()
    public String get(HttpServletResponse response){
        log.info("虚拟请求");
        response.setHeader("Content-Type","application/json");
        return "str";
    }
}
