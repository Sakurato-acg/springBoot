package com.itheima.controller;


import com.itheima.pojo.SMSCode;
import com.itheima.service.SMSCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sms")
public class SMSController {

    @Autowired
    private SMSCodeService service;

    @GetMapping()
    public Result sendCode(String tel) {
        String code = service.sendCode(tel);
        return new Result(Code.GET_OK,code);
    }

    @PostMapping
    public Result checkCode(SMSCode smsCode) {
        boolean checkCode = service.checkCode(smsCode);
        return new Result(Code.GET_OK,checkCode);
    }
}
