package com.wandong.dao;

import com.wandong.domin.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountDao {

    // 查询所有 Account
    @Select("Select * from product")
    List<Product> findAll();

}
