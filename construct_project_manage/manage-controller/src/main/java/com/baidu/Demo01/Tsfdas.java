package com.baidu.Demo01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Tsfdas {


    @RequestMapping("Demo01")
    public String test01(){
        return "sdfadffsadf";
    }
}
