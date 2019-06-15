package com.wandong.dao;

import com.wandong.domin.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    @Select("select * from user where username=#{username} and password=#{password}")
    User find(@Param("username") String username , @Param("password") String password);
}
