package com.itheima.config;

import org.springframework.context.annotation.Bean;

//@Configuration
public class MsgConfig {

    @Bean
    public String msg(){
        return "bean msg";
    }

}
