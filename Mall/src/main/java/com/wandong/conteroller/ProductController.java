package com.wandong.conteroller;

import com.github.pagehelper.PageInfo;
import com.wandong.domin.Product;
import com.wandong.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(@RequestParam(required = true) String cid,
                                @RequestParam(required = false, defaultValue = "1", name = "pageNum") int pageNum,
                                @RequestParam(required = false, defaultValue = "12", name = "pageSize") int pageSize) {
        ModelAndView mv = new ModelAndView();
        List<Product> productList = productService.findAll(cid, pageNum, pageSize);
        PageInfo pageBean = new PageInfo(productList);
        mv.addObject("pagebean", pageBean);
        mv.setViewName("product_list");
        return mv;
    }

    @RequestMapping("findById")
    public ModelAndView findById(@RequestParam(required = true, name = "pid") String pid) {
        ModelAndView mv = new ModelAndView();
        Product product = productService.findById(pid);
        mv.addObject("aProduct", product);
        mv.setViewName("product_info");
        return mv;
    }
}
