package com.itheima;

import com.itheima.pojo.Book;
import com.itheima.service.IBookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@Rollback(value = false)
public class RollBack {

    @Autowired
    private IBookService bookService;

    @Test
    void save(){
        bookService.save(new Book("44","44","44"));
    }
}
