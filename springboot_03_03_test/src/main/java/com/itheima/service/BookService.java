package com.itheima.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.pojo.Book;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lpl
 * @since 2023-01-26
 */
public interface BookService extends IService<Book> {

    public boolean save(Book book);

    public boolean update(Book book);

    public boolean delete(Integer id);

    public Book getById(Integer id);

    public List<Book> getAll();

}
