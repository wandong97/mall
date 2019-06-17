package com.wandong.service.Impl;

import com.alibaba.fastjson.JSON;
import com.wandong.dao.TypeDao;
import com.wandong.domin.Category;
import com.wandong.service.TypeService;
import com.wandong.utils.JedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    private TypeDao typeDao;

    @Override
    public String findAll() {
        String typeListJson;
        Jedis jedis = JedisUtils.getJedis();
        typeListJson = jedis.get("findAllType");
        if(typeListJson==null){
        List<Category> typeList = typeDao.findAll();
         typeListJson = JSON.toJSONString(typeList);
            jedis.set("findAllType",typeListJson);
        }
        jedis.close();
        return typeListJson;
    }
}
