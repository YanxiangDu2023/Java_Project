package com.itheima.controller;

import com.itheima.pojo.Emp;
import com.itheima.pojo.Result;
import com.itheima.service.EmpService;
import com.itheima.service.impl.EmpServiceA;
import com.itheima.utils.XmlParserUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
    public class EmpController {

    private EmpService empService = new EmpServiceA() {

        @RequestMapping("/listEmp")
        public Result List() {
            // 1.调用service，获取数据


            List<Emp> emplist = empService.listEmp();

            // 响应数据
            return Result.success(emplist);

        }
    };
}




//        @RequestMapping("/listEmp")
//        public Result list() {
//            //1. 加载and解析
//            String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
//            System.out.println(file);
//            List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
//
//            //    this.getClass().getClassLoader().getResource("emp.xml").getFile()：通过类加载器获取 emp.xml 文件的路径。这个 XML 文件通常放在项目的 resources 目录下
//            //    XmlParserUtils.parse(file, Emp.class)：调用自定义的工具类 XmlParserUtils 解析 XML 文件，将其转换为 Emp 对象列表 (List<Emp>)。Emp 是一个包含员工信息的 Java 类。
//
//            //对数据进行转换处理 -gender, job
//            empList.stream().forEach(emp -> {
//                String gender = emp.getGender();
//                if ("1".equals(gender)) {
//                    emp.setGender("M");
//
//                } else if ("2".equals(gender)) {
//
//                    emp.setGender("F");
//                }
//
//                // 处理job -1:讲师， 2:班主任，3:就业导师
//                String job = emp.getJob();
//
//                if ("1".equals(job)) {
//                    emp.setJob("Teacher");
//
//                } else if ("2".equals(job)) {
//
//                    emp.setJob("Master");
//                } else if ("3".equals(job)) {
//                    emp.setJob("Manager");
//                }
//
//            });
//
//            return Result.success(empList);
//
//        }



















