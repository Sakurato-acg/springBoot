package com.itheima.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.mapper.BookMapper;
import com.itheima.pojo.Book;
import com.itheima.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IBookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public IPage<Book> getPage(int start, int pageSize,Book book) {
        IPage<Book> page = new Page<Book>(start, pageSize);

        LambdaQueryWrapper<Book> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(book.getName()!=null,Book::getName,book.getName());
        queryWrapper.like(book.getDescription()!=null,Book::getDescription,book.getDescription());
        queryWrapper.like(book.getType()!=null,Book::getType,book.getType());


        bookMapper.selectPage(page,queryWrapper);
        return page;
    }

    @Override
    public IPage<Book> getPage() {
        IPage<Book> page = new Page<Book>();
        return bookMapper.selectPage(page, null);
    }
}
