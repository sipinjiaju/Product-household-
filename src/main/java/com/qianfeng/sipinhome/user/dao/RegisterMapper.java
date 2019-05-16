package com.qianfeng.sipinhome.user.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RegisterMapper {
    void registerUser(@Param("phone") String phone,@Param("password") String password);
}
