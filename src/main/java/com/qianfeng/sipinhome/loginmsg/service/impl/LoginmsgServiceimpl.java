package com.qianfeng.sipinhome.loginmsg.service.impl;

import com.qianfeng.sipinhome.loginmsg.dao.LoginmsgMapper;
import com.qianfeng.sipinhome.loginmsg.dto.User;
import com.qianfeng.sipinhome.loginmsg.service.LoginmsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginmsgServiceimpl implements LoginmsgService {
    @Autowired
    private LoginmsgMapper loginmsgMapper;
    @Override
    public User querybytel(String phone) {
        User user = loginmsgMapper.querybytel(phone);
        return user;
    }
}
