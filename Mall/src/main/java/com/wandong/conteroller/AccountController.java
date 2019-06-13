package com.wandong.conteroller;

import com.wandong.domin.Product;
import com.wandong.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    //SSM环境搭建测试
    @RequestMapping("/test")
    public String test() {
      List<Product> productList=accountService.findAll();
    for (Product account:productList){
        System.out.println(account.getPname());
    }
        return "success";

    }
}
