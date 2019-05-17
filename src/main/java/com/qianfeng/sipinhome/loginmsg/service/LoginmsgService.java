package com.qianfeng.sipinhome.loginmsg.service;

import com.qianfeng.sipinhome.loginmsg.dto.User;

public interface LoginmsgService {
    User querybytel(String phone);
}
