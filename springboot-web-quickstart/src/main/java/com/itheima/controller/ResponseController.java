package com.itheima.controller;

import com.itheima.pojo.Address;
import com.itheima.pojo.Result;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ResponseController {

//    @RequestMapping("/hello1")
//    public String hello1(){
//        System.out.println("Hello World ~");
//        //return new Result(1,"success","Hello World ~");
//        return "Hello World~";
//    }
//
//    @RequestMapping("/getAddr")
//    public Address getAddr(){
//        Address addr = new Address();
//        addr.setProvince("广东");
//        addr.setCity("深圳");
//        return addr;
//    }
//
//    @RequestMapping("/listAddr")
//    public List<Address> ListAddr(){
//        List<Address> list = new ArrayList<>();
//
//        Address addr = new Address();
//        addr.setProvince("广东");
//        addr.setCity("深圳");
//
//        Address addr2 = new Address();
//        addr2.setProvince("陕西");
//        addr2.setCity("西安");
//
//        list.add(addr);
//        list.add(addr2);
//        return list;
//    }

    @RequestMapping("/hello1")
    public Result hello1(){
        System.out.println("Hello World ~");
        //return new Result(1,"success","Hello World ~");
        return Result.success("Hello,World");
    }

    @RequestMapping("/getAddr")
    public Result getAddr(){
        Address addr = new Address();
        addr.setProvince("广东");
        addr.setCity("深圳");
        return Result.success(addr);
    }

    @RequestMapping("/listAddr")
    public Result ListAddr(){
        List<Address> list = new ArrayList<>();

        Address addr = new Address();
        addr.setProvince("广东");
        addr.setCity("深圳");

        Address addr2 = new Address();
        addr2.setProvince("陕西");
        addr2.setCity("西安");

        list.add(addr);
        list.add(addr2);
        return Result.success(list);
    }




}













