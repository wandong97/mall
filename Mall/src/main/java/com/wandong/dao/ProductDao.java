package com.wandong.dao;

import com.wandong.domin.Product;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductDao {
    @Select("select * from product where cid=#{cid}")
    @Results({
            @Result(column = "pid",id = true,property = "pid"),
            @Result(column = "pname",property = "pname"),
            @Result(column = "market_price",property = "market_price"),
            @Result(column = "shop_price",property = "shop_price"),
            @Result(column = "pimage",property = "pimage"),
            @Result(column = "pdate",property = "pdate"),
            @Result(column = "is_hot",property = "is_hot"),
            @Result(column = "pflag",property = "pflag"),
            @Result(column = "cid",property = "category",one=
            @One(select ="com.wandong.dao.TypeDao.findById"))

    })
    List<Product> findAll(String cid);

    @Select("select * from product where pid=#{pid}")
    @Results({
            @Result(column = "pid",id = true,property = "pid"),
            @Result(column = "pname",property = "pname"),
            @Result(column = "market_price",property = "market_price"),
            @Result(column = "shop_price",property = "shop_price"),
            @Result(column = "pimage",property = "pimage"),
            @Result(column = "pdate",property = "pdate"),
            @Result(column = "is_hot",property = "is_hot"),
            @Result(column = "pflag",property = "pflag"),
            @Result(column = "cid",property = "category",one=
            @One(select ="com.wandong.dao.TypeDao.findById"))

    })
    Product findById(String pid);
}
