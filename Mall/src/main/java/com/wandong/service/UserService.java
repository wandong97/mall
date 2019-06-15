package com.wandong.service;

import com.wandong.domin.User;

public interface UserService {

    User find(String id , String pwd);
}
