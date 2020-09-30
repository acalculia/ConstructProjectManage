package com.baidu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Tsfdas {

    @ResponseBody
    @RequestMapping("Demo01")
    public String test01(){
        return "sdfadffsadf";
    }


    @RequestMapping("login")
    public String login(){
        return "login";
    }


    @RequestMapping("index")
    public String index(){
        return "index";
    }




}
