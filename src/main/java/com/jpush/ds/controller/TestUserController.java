package com.jpush.ds.controller;

import com.jpush.ds.pojo.TestUser;
import com.jpush.ds.service.PmsProductService;
import com.jpush.ds.service.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class TestUserController {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private PmsProductService pmsProductService;


    @GetMapping("/update")
    public String update(){
        pmsProductService.update();
        return "product update";
    }

    @GetMapping("/get")
    public String get(){
        pmsProductService.get();
        return "product get";
    }

//    @GetMapping("/")
//    public String index(){
//        testUserService.get();
//        return "index";
//    }
}
