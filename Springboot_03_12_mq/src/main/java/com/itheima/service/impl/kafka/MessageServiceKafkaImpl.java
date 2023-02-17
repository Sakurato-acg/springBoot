package com.itheima.service.impl.kafka;

import com.itheima.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceKafkaImpl implements MessageService {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void sendMessage(String id) {
        System.out.println("使用Kafka将待发送短信的订单纳入处理队列，id：" + id);
        kafkaTemplate.send("kafka_topic", id);
    }

    @Override
    public String doMessage() {
        return null;
    }
}
