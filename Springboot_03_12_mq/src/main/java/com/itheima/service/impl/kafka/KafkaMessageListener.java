package com.itheima.service.impl.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaMessageListener {
    @KafkaListener(topics = {"kafka_topic"})
    public void onMessage(ConsumerRecord<?, ?> record) {
        System.out.println("已完成短信发送业务，id：" + record.value());
    }
}

