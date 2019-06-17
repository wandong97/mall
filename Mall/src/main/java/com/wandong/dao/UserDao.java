package com.wandong.dao;

import com.wandong.domin.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    @Select("select * from user where username=#{username}")
    User find(@Param("username") String username);

    @Insert("insert into user(uid,username,password,name,email,telephone,birthday,sex,state,code) values(#{uid},#{username},#{password},#{name},#{email},#{telephone},#{birthday},#{sex},#{state},#{code})")
    void save(User user);
}
