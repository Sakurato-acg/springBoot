package com.itheima.springboot_03_06_mongodb;

import lombok.Data;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    void contextLoads() {
        Book book = new Book();
        book.setId(1L);
        book.setName("springboot");
        book.setType("springboot");
        book.setDescription("springboot");
        mongoTemplate.save(book);
    }

    @Test
    void get(){
        List<Book> all = mongoTemplate.findAll(Book.class);
        all.forEach(System.out::println);
    }
}

@Data
 class Book{
    private Long id;
    private String name;
    private String type;
    private String description;
 }