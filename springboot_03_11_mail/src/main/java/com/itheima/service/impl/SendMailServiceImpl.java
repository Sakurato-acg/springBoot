package com.itheima.service.impl;

import com.itheima.service.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;
import java.io.File;

@Service
public class SendMailServiceImpl implements SendMailService {
//    @Autowired
//    private JavaMailSender mailSender;
//
//    //发送人
//    private String form="2858534773@qq.com";
//    //接收人
//    private String to="2858534773@qq.com";
//    //标题
//    private String subject="标题";
//    //正文
//    private String context="邮件正文";
//    @Override
//    public void sendMail() {
//
//        SimpleMailMessage message=new SimpleMailMessage();
//        message.setFrom(form+("lpl"));
//        message.setTo(to);
//        message.setSubject(subject);
//        message.setText(context);
////        message.setSentDate();
//
//        mailSender.send(message);
//    }

    @Autowired
    private JavaMailSender mailSender;

    //发送人
    private String form="2858534773@qq.com";
    //接收人
    private String to="2858534773@qq.com";
    //标题
    private String subject="标题";
    //正文
    private String context="<a href=''>连接</a>";
    @Override
    public void sendMail() {

        try {
            MimeMessage mimeMessage = mailSender.createMimeMessage();

            MimeMessageHelper helper=new MimeMessageHelper(mimeMessage,true);

            helper.setFrom(form+"()");
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(context,true);

            //附件
            File file=new File("C:\\Users\\lpl\\eclipse-workspace\\springBoot\\springboot_03_11_mail\\target\\springboot_03_11_mail-0.0.1-SNAPSHOT.jar");
            helper.addAttachment(file.getName(),file);
            mailSender.send(mimeMessage);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
