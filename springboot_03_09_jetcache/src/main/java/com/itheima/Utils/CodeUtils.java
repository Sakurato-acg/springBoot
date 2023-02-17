package com.itheima.Utils;



import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class CodeUtils {

    public String generator(String tel) {

        int hashCode = tel.hashCode();
        int encryption = 2020666;
        long result = hashCode ^ encryption;
        long time = System.currentTimeMillis();
        result = result ^ time;

        long code = result % 1000000;
        code = Math.abs(code);
        return String.format("%06d", code);

    }
    @Cacheable(value ="smsCode",key = "#tel")
    public String cache(String tel){
        return null;
    }
}
