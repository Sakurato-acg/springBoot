package com.itheima;

import com.itheima.mapper.BangumiMapper;
import com.itheima.pojo.Bangumi;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot0104MybatisApplicationTests {

    @Autowired
    private BangumiMapper bangumiMapper;

    @Test
    void contextLoads() {
        List<Bangumi> all = bangumiMapper.getAll();
        all.forEach(System.out::println);
    }

}
