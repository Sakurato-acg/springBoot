package com.itheima.mapper.impl;

import com.itheima.mapper.BookMapper;
import org.springframework.stereotype.Repository;

@Repository
public class BookMapperImpl implements BookMapper {
    @Override
    public void save() {
        System.out.println("saving");
    }
}
