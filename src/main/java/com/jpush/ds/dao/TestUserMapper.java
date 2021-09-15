package com.jpush.ds.dao;


import com.jpush.ds.pojo.TestUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestUserMapper {
    TestUser selectById(Integer id);

    int update(TestUser user);
}
