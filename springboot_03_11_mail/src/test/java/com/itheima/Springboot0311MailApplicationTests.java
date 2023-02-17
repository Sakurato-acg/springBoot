package com.itheima;

import com.itheima.service.SendMailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.mail.MessagingException;

@SpringBootTest
class Springboot0311MailApplicationTests {

    @Autowired
    private SendMailService mailService;
    @Test
    void contextLoads() throws MessagingException {
        mailService.sendMail();
    }

}
