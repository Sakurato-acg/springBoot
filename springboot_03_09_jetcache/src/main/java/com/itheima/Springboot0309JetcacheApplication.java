package com.itheima;

import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import com.alicp.jetcache.anno.config.EnableMethodCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCreateCacheAnnotation
@EnableMethodCache(basePackages = "com.itheima")
public class Springboot0309JetcacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot0309JetcacheApplication.class, args);
    }

}
