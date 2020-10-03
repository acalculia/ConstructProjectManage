package com.baidu.wrs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    //登录
    @RequestMapping("login")
    public String login(){
        return "login";
    }

    //主页
    @RequestMapping("index")
    public String index(){
        System.out.println("index");
        return "index";
    }

    //项目信息
    @RequestMapping("member-list")
    public String memberList(){
        return "member-list";
    }

    //招标文件购买申请
    @RequestMapping("member-list1")
    public String memberList1(){
        return "member-list1";
    }

    //资格自审
    @RequestMapping("member-list2")
    public String memberList2(){
        return "member-list2";
    }

    //项目勘察
    @RequestMapping("member-list3")
    public String memberList3(){
        return "member-list3";
    }

    //投标文件审查
    @RequestMapping("member-list4")
    public String memberList4(){
        return "member-list4";
    }

    //投标保证金申请
    @RequestMapping("member-list5")
    public String memberList5(){
        return "member-list5";
    }

    //竞争对手情况
    @RequestMapping("member-list6")
    public String memberList6(){
        return "member-list6";
    }

    //项目业务费申请
    @RequestMapping("member-list7")
    public String memberList7(){
        return "member-list7";
    }
}
