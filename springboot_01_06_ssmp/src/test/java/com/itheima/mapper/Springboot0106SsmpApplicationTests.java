package com.itheima.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot0106SsmpApplicationTests {

    @Autowired
    private BookMapper bookMapper;

    @Test
    void selectAll(){
        List<Book> all = bookMapper.selectList(null);
    }

    @Test
    void getById(){
        bookMapper.selectById(1);
    }

    @Test
    void testSave(){
        Book book = new Book();
        book.setType("测试数据123");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookMapper.insert(book);
    }

    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(17);
        book.setType("测试数据abcdefg");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookMapper.updateById(book);
    }

    @Test
    void testDelete(){
        bookMapper.deleteById(17);
    }

    @Test
    void testGetPage(){

        IPage<Book> page = new Page<>(1,2);
        bookMapper.selectPage(page, new QueryWrapper<>());

        System.out.println("当前页码值："+page.getCurrent());
        System.out.println("每页显示数："+page.getSize());
        System.out.println("一共多少页："+page.getPages());
        System.out.println("一共多少条数据："+page.getTotal());
        System.out.println("数据：");
        List<Book> records = page.getRecords();
        records.forEach(System.out::println);
    }

    @Test
    void testGetBy(){
        String name=null;

//        QueryWrapper<Book> qw = new QueryWrapper<>();
//        qw.like("name","Spring");
//        bookMapper.selectList(qw);

        LambdaQueryWrapper<Book> lqw=new LambdaQueryWrapper<>();

        lqw.like(name!=null,Book::getName,name);

        bookMapper.selectList(lqw);
    }
}
