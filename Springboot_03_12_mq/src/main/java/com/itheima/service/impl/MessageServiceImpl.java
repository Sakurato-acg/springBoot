package com.itheima.service.impl;

import com.itheima.service.MessageService;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

//@Service
@Slf4j
public class MessageServiceImpl implements MessageService {


    private ArrayList<String> list=new ArrayList<>();

    @Override
    public void sendMessage(String id) {
        log.info("待发送短信的订单已纳入处理队列id:"+id);
        list.add(id);
    }

    @Override
    public String doMessage() {
        String id = list.remove(0);
        log.info("已完成id:"+id);
        return id;
    }
}
