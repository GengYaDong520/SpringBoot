package com.baizhi.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/user")
public class Controller {

    @RequestMapping("/one")
    public  String one()throws Exception{
        System.out.println("我是第一个程序");
        return "index";
    }
}
