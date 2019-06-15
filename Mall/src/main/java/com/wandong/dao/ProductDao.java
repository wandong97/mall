package com.wandong.dao;

import com.wandong.domin.Product;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao {
    @Select("select * from product where cid=#{cid}")
    List<Product> findAll(String cid);
}
