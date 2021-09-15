package com.jpush.ds.service;

import com.jpush.ds.dao.PmsProductMapper;
import com.jpush.ds.dao.TestUserMapper;
import com.jpush.ds.pojo.PmsProduct;
import com.jpush.ds.pojo.TestUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

@Service
public class PmsProductService {

    @Autowired
    private PmsProductMapper pmsProductMapper;


    @Autowired
    private TestUserMapper testUserMapper;

    @Transactional(rollbackFor = Exception.class)
    public void update(){
        PmsProduct product = pmsProductMapper.selectById(1);
       updateProduct();
        System.out.println(1);
//       updateUser();
    }

    private void updateProduct(){
        Random random = new Random();
        int i = random.nextInt(100);
        System.out.println(i);
        PmsProduct product = new PmsProduct();
        product.setId(1);
        product.setName("su:"+i);
        pmsProductMapper.update(product);
    }

    private void updateUser(){
        Random random = new Random();
        int i = random.nextInt(100);
        System.out.println(i);
        TestUser testUser = new TestUser();
        testUser.setId(1);
        testUser.setUsername("ai:"+i);
        testUserMapper.update(testUser);
    }

    @Transactional
    public void get(){
        PmsProduct product = pmsProductMapper.selectById(1);
        System.out.println();
    }
}
