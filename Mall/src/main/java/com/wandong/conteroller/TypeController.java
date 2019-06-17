package com.wandong.conteroller;

import com.wandong.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/type")
public class TypeController {
    @Autowired
    private TypeService typeService;

    @RequestMapping(value = "/findAllTypes")
    @ResponseBody
    public String findAllType() {
        String typeListJson = typeService.findAll();
        return typeListJson;
    }
}

