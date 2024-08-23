package com.msb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {
    @RequestMapping("/test01")
    @ResponseBody
    public String test01(){
        return "hi, springboot...";
    }
}





