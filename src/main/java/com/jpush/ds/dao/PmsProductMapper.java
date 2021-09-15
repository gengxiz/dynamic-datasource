package com.jpush.ds.dao;

import com.jpush.ds.pojo.PmsProduct;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PmsProductMapper {

    PmsProduct selectById(Integer id);

    int update(PmsProduct product);
}
