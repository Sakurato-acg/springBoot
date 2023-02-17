package com.itheima.mapper;

import com.itheima.pojo.Bangumi;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BangumiMapper {

    @Select("select id, name, type, time, status, year, picture, userId from bangumi limit 0,5")
    public List<Bangumi> getAll();

}
