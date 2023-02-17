package com.itheima;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class Springboot0305RedisApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    void set() {
        ValueOperations ops = redisTemplate.opsForValue();
        ops.set("age",41);
    }

    @Test
    void get(){
        ValueOperations ops = redisTemplate.opsForValue();
        System.out.println("ops.get(\"age\") = " + ops.get("age"));
    }

    @Test
    void hSet(){
        HashOperations hashOperations = redisTemplate.opsForHash();

        hashOperations.put("user","username",2120400146);
    }

    @Test
    void hGet(){
        HashOperations hashOperations = redisTemplate.opsForHash();

        System.out.println("hashOperations.get(\"user\",\"username\") = " + hashOperations.get("user", "username"));
    }
}
