package com.itheima.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lpl
 * @since 2023-01-26
 */

@Mapper
public interface BookMapper extends BaseMapper<Book> {

}
