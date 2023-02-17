package com.itheima;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.mapper.BangumiMapper;
import com.itheima.pojo.Bangumi;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot0105MybatisPlusApplicationTests {


    @Autowired
    private BangumiMapper bangumiMapper;

    @Test
    void test() {
        Bangumi bangumi = new Bangumi();
        bangumi.setUserId(2);
//        System.out.println(bangumi);
        List<Bangumi> bangumiList = bangumiMapper.selectList(new QueryWrapper<>(bangumi));
    }

    @Test
    void page(){
        Bangumi bangumi = new Bangumi();
        bangumi.setYear(2022);
        bangumi.setTime(7);

        IPage<Bangumi> page = new Page<>(1,2);
        bangumiMapper.selectPage(page,new QueryWrapper<>(bangumi));

        System.out.println("当前页码值："+page.getCurrent());
        System.out.println("每页显示数："+page.getSize());
        System.out.println("一共多少页："+page.getPages());
        System.out.println("一共多少条数据："+page.getTotal());
        System.out.println("数据：");
        List<Bangumi> records = page.getRecords();
        records.forEach(System.out::println);
    }
    @Test
    void contextLoads() {
    }

}
