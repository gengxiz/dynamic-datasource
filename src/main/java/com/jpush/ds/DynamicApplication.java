package com.jpush.ds;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@MapperScan(basePackages = "com.jpush.ds.dao")
@SpringBootApplication
public class DynamicApplication {
    public static void main(String[] args) {
        SpringApplication.run(DynamicApplication.class,args);
    }
}
