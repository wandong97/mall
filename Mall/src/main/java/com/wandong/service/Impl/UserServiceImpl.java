package com.wandong.service.Impl;

import com.wandong.dao.UserDao;
import com.wandong.domin.User;
import com.wandong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User find(String id, String pwd) {
        User user = userDao.find(id, pwd);
        return user;
    }
}
