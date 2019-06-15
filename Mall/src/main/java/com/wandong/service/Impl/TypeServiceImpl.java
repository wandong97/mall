package com.wandong.service.Impl;

import com.alibaba.fastjson.JSON;
import com.wandong.dao.TypeDao;
import com.wandong.domin.Category;
import com.wandong.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    private TypeDao typeDao;

    @Override
    public String findAll() {
        List<Category> typeList = typeDao.findAll();
        String typeListJson = JSON.toJSONString(typeList);
        return typeListJson;
    }
}
