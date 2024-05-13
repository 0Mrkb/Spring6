package com.controller;

import com.pojo.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @RequestMapping("plist")
public ModelAndView getlist(){
        List<Product> plist = new ArrayList<Product>();
        Product p1 = new Product(1,"测试手机",2000,"测试手机描述");
        Product p2 = new Product(2,"测试笔记本",4500,"测试笔记本");
        Product p3 = new Product(3,"测试iPad",2000,"测试iPad描述");
        plist.add(p1);
        plist.add(p2);
        plist.add(p3);
        ModelAndView model = new ModelAndView();
        model.addObject("plist",plist);
        model.setViewName("plist");
        return model;
    }
}
