package com.wandong.dao;

import com.wandong.domin.Category;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TypeDao {

    @Select("select * from category")
    List<Category> findAll();
}
