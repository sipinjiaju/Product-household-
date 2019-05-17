package com.qianfeng.sipinhome.loginmsg.dao;

import com.qianfeng.sipinhome.loginmsg.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LoginmsgMapper {
    User querybytel(@Param("phone") String phone);
}
