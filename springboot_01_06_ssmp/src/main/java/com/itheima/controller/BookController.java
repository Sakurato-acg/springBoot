package com.itheima.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.exception.SystemException;
import com.itheima.pojo.Book;
import com.itheima.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author lpl
 * @since 2023-01-26
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private IBookService iBookService;


    @PostMapping
    public Result save(@RequestBody Book book) {

        boolean flag = iBookService.save(book);

        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR, flag);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {

        boolean update = iBookService.updateById(book);

        return new Result(update ? Code.UPDATE_OK : Code.UPDATE_ERR, update);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = iBookService.removeById(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR, flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {

        Book book = iBookService.getById(id);

        Integer code = book != null ? Code.GET_OK : Code.GET_ERR;
        String msg = book != null ? "" : "数据查询失败";

        return new Result(code, book, msg);
    }

    @GetMapping("/all")
    public Result getAll() {
        try {
            int i = 1 / 0;
        } catch (ArithmeticException e) {
            //系统异常
            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR, "服务器访问超时，请重试", e);
        }
        List<Book> list = iBookService.list();
        Integer code = list.isEmpty() ? Code.GET_ERR : Code.GET_OK;
        String msg = list.isEmpty() ? "数据查询失败" : "数据查询成功 ";
        return new Result(code, list, msg);
    }

    @GetMapping()
    public Result getByPage(Book book,
                            @RequestParam(required = false) Integer currentPage,
                            @RequestParam(required = false) Integer pageSize) {

//        Book book = JSON.parseObject(bookJson, Book.class);

        if (currentPage != null && pageSize != null) {
            IPage<Book> page = iBookService.getPage(currentPage, pageSize,book);

            //只有一条数据时
            if (currentPage > page.getPages()) {
                page = iBookService.getPage(Math.toIntExact(page.getPages()), pageSize,book);
            }

            Integer code = page.getRecords().isEmpty() ? Code.GET_ERR : Code.GET_OK;
            String msg = page.getRecords().isEmpty() ? "数据查询失败" : "数据查询成功 ";
            return new Result(code, page, msg);

        } else {
            IPage<Book> getAll = new Page<>();
            List<Book> list = iBookService.list();
            getAll.setRecords(list);
            getAll.setTotal(iBookService.count());

            Integer code = getAll.getRecords().isEmpty() ? Code.GET_ERR : Code.GET_OK;
            String msg = getAll.getRecords().isEmpty() ? "数据查询失败" : "数据查询成功 ";
            return new Result(code, getAll, msg);
        }
    }
}

