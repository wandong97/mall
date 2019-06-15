package com.wandong.service;

import com.wandong.domin.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll(String cid,int pageNum,int pageSize);
}
