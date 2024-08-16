package com.itheima.controller;

import com.itheima.pojo.user;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

@RestController
public class RequestController {
//
//    @RequestMapping("/simpleParam")
//    public String simpleParam(HttpServletRequest request) {
//
//        String name = request.getParameter("name");
//
//        String ageStr = request.getParameter("age");
//
//        int age = Integer.parseInt(ageStr);
//        System.out.println(name + " " + ageStr);
//        return "Ok";
//
//
//

    // springboot方式
    @RequestMapping("/simpleParam")
    public String simpleParam(String name, Integer age) {
        System.out.println(name + ":" + age);
        return "OK";

    }


    @RequestMapping("/simplePojo")
// 封装前端传递过来的参数
    public String simplepojo(user user) {
        System.out.println(user);
        return "OK";
    }


    @RequestMapping("/complexPojo")
// 封装前端传递过来的参数
    public String complexPojo(user user) {
        System.out.println(user);
        return "OK";
    }

    @RequestMapping("/arrayParam")
// 封装前端传递过来的参数
    public String arrayParam(String[] hobby) {
        System.out.println(Arrays.toString(hobby));
        return "OK";
    }


    @RequestMapping("/listParam")
// 封装前端传递过来的参数
    public String listParam(@RequestParam List<String> hobby) {
        System.out.println(hobby);
        return "OK";
    }


    // 日期时间参数
    @RequestMapping("/dataParam")
// 封装前端传递过来的参数
    public String dataParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime) {
        System.out.println(updateTime);
        return "OK";

    }

    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody user user) {
        System.out.println(user);
        return "OK";

}

@RequestMapping("/path/{id}")
public String pathParam(@PathVariable("id") Integer id) {
    System.out.println(id);
    return "OK";

}

    @RequestMapping("/path/{id}/{name}")
    public String pathParam(@PathVariable Integer id, @PathVariable String name) {
        System.out.println(id);
        System.out.println(name);
        return "OK";

    }






}

















