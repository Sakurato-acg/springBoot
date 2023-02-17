package com.itheima.service;

import com.itheima.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ServiceTest{

    @Autowired
    private BookService bookService;

    @Autowired
    private IBookService iBookService;

    @Test
    void test(){
//        QueryWrapper<Book> bookQueryWrapper = new QueryWrapper<Book>();
//
//        bookQueryWrapper.eq("id",12);
//        List<Book> list = bookService.list(bookQueryWrapper);


        List<Book> all = bookService.getAll();
    }

    @Test
    void mp(){
        iBookService.list();
    }
}
