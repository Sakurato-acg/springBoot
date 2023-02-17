package com.itheima.service.impl;

import com.itheima.Utils.CodeUtils;
import com.itheima.pojo.SMSCode;
import com.itheima.service.SMSCodeService;
import net.rubyeye.xmemcached.MemcachedClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SMSCodeServiceImpl implements SMSCodeService {

    @Autowired
    private CodeUtils codeUtils;


//    @Override
//    @CachePut(value ="smsCode",key = "#tel")
//    public String sendCode(String tel) {
//        return codeUtils.generator(tel);
//    }
//
//    @Override
//    public boolean checkCode(SMSCode smsCode) {
//        String code=smsCode.getCode();
//        String cacheCode=codeUtils.cache(smsCode.getTel());
//        return cacheCode.equals(code);
//    }

    @Autowired
    private MemcachedClient memcachedClient;

    @Override
    public String sendCode(String tel) {
        String code = this.codeUtils.generator(tel);
        //将数据加入memcache
        try {
            memcachedClient.set(tel, 0, code);
            // key,timeout,value
        } catch (Exception e) {
            e.printStackTrace();
        }
        return code;
    }

    @Override
    public boolean checkCode(SMSCode smsCode) {
        String value = null;
        try {
            value = memcachedClient.get(smsCode.getTel()).toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return smsCode.getCode().equals(value);
    }


}
