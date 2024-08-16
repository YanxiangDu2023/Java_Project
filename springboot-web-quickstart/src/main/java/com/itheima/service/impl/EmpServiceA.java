package com.itheima.service.impl;

import com.itheima.dao.EmpDao;
import com.itheima.dao.impl.EmpDaoA;
import com.itheima.pojo.Emp;
import com.itheima.pojo.Result;
import com.itheima.service.EmpService;

import java.util.List;

public class EmpServiceA implements EmpService {
    private EmpDao empDao = new EmpDaoA();

    @Override
    public List<Emp> listEmp(){
        List<Emp> empList = empDao.listEmp();

        empList.stream().forEach(emp -> {
            String gender = emp.getGender();
            if ("1".equals(gender)) {
                emp.setGender("M");

            } else if ("2".equals(gender)) {

                emp.setGender("F");
            }

            // 处理job -1:讲师， 2:班主任，3:就业导师
            String job = emp.getJob();

            if ("1".equals(job)) {
                emp.setJob("Teacher");

            } else if ("2".equals(job)) {

                emp.setJob("Master");
            } else if ("3".equals(job)) {
                emp.setJob("Manager");
            }

        });

        return empList;

    }





}
