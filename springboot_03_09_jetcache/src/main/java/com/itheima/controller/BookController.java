package com.itheima.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.pojo.Book;
import com.itheima.service.IBookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author lpl
 * @since 2023-01-26
 */
@Slf4j
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private IBookService iBookService;

    @GetMapping()
    public Result getByPage(Book book,
                            @RequestParam(required = false) Integer currentPage,
                            @RequestParam(required = false) Integer pageSize) {

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

