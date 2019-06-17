package com.wandong.service.Impl;

import com.github.pagehelper.PageHelper;
import com.wandong.dao.ProductDao;
import com.wandong.domin.Product;
import com.wandong.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
   private ProductDao productDao;

    @Override
    public List<Product> findAll(String cid,int pageNum,int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Product> productList = productDao.findAll(cid);
        return productList;
    }

    @Override
    public Product findById(String pid) {
        Product product = productDao.findById(pid);
        return product;
    }
}
