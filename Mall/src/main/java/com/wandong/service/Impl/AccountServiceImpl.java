package com.wandong.service.Impl;

import com.wandong.dao.AccountDao;
import com.wandong.domin.Product;
import com.wandong.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    // 查询所有 Account
    public List<Product> findAll() {
        System.out.println("service findAll 成功");
        List<Product> accountList=accountDao.findAll();
        return accountList;
    }
}
