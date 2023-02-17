package com.itheima.service;

import com.itheima.pojo.SMSCode;


public interface SMSCodeService {
    public String sendCode(String tel);
    public boolean checkCode(SMSCode smsCode);

}
