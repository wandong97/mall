package com.wandong.service.Impl;

import com.wandong.dao.UserDao;
import com.wandong.domin.User;
import com.wandong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    @Autowired
    private UserDao userDao;

    @Override
    public User find(String id, String pwd) {
        User user = userDao.find(id);
        if(user!=null) {
            boolean matches = encoder.matches(pwd, user.getPassword());
            if (matches == false) {
                user = null;
            }
        }
        return user;
    }

    @Override
    public void save(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        userDao.save(user);
    }
}
