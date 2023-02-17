package com.itheima;

import com.itheima.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot0103JunitApplicationTests {

    @Autowired
    private BookMapper bookMapper;
    @Test
    void contextLoads() {
        bookMapper.save();
    }

}
