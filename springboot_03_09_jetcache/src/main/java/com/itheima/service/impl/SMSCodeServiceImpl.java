package com.itheima.service.impl;


import com.alicp.jetcache.Cache;
import com.alicp.jetcache.anno.CacheType;
import com.alicp.jetcache.anno.CreateCache;
import com.itheima.Utils.CodeUtils;
import com.itheima.pojo.SMSCode;
import com.itheima.service.SMSCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SMSCodeServiceImpl implements SMSCodeService {

    @Autowired
    private CodeUtils codeUtils;


    @CreateCache(area = "default",name = "smsSpace",expire = 60,cacheType = CacheType.LOCAL)
    private Cache<String,String> cache;


    @Override
    public String sendCode(String tel) {
        String code = codeUtils.generator(tel);
        cache.put(tel,code);
        return code;
    }

    @Override
    public boolean checkCode(SMSCode smsCode) {
        String code=smsCode.getCode();
        String cacheCode=cache.get(smsCode.getTel());
        return cacheCode.equals(code);
    }


}
