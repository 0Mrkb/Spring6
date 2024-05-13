package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/method")
public class MethodController {
    @RequestMapping("/items")
    public String getParams(@RequestParam("ownerName")String ownerName,
                             @RequestParam("itemName") String itemName,
                              @RequestParam("itemPrice")String itemPrice){
        System.out.println("宝贝主人:"+ownerName);
        System.out.println("宝贝名称:"+itemName);
        System.out.println("宝贝价格:"+itemPrice);
        return  "index";
    }
}
