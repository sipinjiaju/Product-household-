package com.qianfeng.sipinhome.loginmsg.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("send")
public class Thymeleaf {
    @RequestMapping("templates/{html}")
    public String toHtml(@PathVariable("html") String html){
        return html;
    }

}
