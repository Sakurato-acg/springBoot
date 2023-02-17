package com.itheima.service.impl.rabbitmq.direct.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

//@Component
public class MessageListener {

    @RabbitListener(queues = "direct.queue")
    public void receive(String id) {
        System.out.println("已完成短信发送业务，id：" + id);
    }
}
