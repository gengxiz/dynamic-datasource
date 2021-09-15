package com.jpush.ds.service;

import com.jpush.ds.dao.TestUserMapper;
import com.jpush.ds.pojo.TestUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestUserService {
    @Autowired
    private TestUserMapper testUserMapper;

    @Transactional
    public void get(){
        TestUser testUser = testUserMapper.selectById(1);
        System.out.println();
    }
}
