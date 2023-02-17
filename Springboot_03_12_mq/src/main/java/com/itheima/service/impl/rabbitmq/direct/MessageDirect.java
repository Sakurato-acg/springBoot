//package com.itheima.service.impl.rabbitmq.direct;
//
//import com.itheima.service.MessageService;
//import org.springframework.amqp.core.AmqpTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
////@Service
//public class MessageDirect implements MessageService {
//
////    @Autowired
//    private AmqpTemplate template;
//
//    @Override
//    public void sendMessage(String id) {
//        System.out.println("已纳入处理队列direct");
//        template.convertAndSend("directExchange","direct",id);
//    }
//
//    @Override
//    public String doMessage() {
//        return null;
//    }
//}
