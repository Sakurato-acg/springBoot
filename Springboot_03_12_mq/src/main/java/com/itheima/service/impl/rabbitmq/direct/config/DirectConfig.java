package com.itheima.service.impl.rabbitmq.direct.config;


import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;

//@Configuration
public class DirectConfig {
//    @Bean
    public Queue directQueue(){
        return new Queue("direct.queue",true,true,true);
    }

//    @Bean
    public DirectExchange directExchange(){
        return new DirectExchange("directExchange");
    }

//    @Bean
    public Binding binding(){
        return BindingBuilder.bind(directQueue()).to(directExchange()).with("direct");
    }
}
