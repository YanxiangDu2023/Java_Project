package com.itheima.dao.impl;

import com.itheima.dao.EmpDao;
import com.itheima.pojo.Emp;
import com.itheima.utils.XmlParserUtils;

import java.util.List;

public class EmpDaoA implements EmpDao {
    public List<Emp> ListEmp() {
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        System.out.println(file);
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
        return empList;
    }
}
