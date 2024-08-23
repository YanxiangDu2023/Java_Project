package com.msb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//on.run(TestSpringBootApplication.class, args); 会启动 Spring 应用，并且会自动扫描 com.msb 包及其子包中的所有 Spring 组件。

@SpringBootApplication
@MapperScan("com.msb.mapper")
public class TestSpringBootApplication {
    public static void main(String[] args){
        SpringApplication.run(TestSpringBootApplication.class, args);

    }


}


