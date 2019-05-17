package com.qianfeng.sipinhome.loginmsg.controller;

import com.qianfeng.sipinhome.loginmsg.dto.User;
import com.qianfeng.sipinhome.loginmsg.service.LoginmsgService;
import com.qianfeng.sipinhome.loginmsg.vo.JsonResultVO;
import com.zhenzi.sms.ZhenziSmsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;
@Controller
public class Loginmsg {
    @Autowired
    private LoginmsgService loginmsgService;
    JsonResultVO resultVO = new JsonResultVO();
       @RequestMapping("sendsmg")
       @ResponseBody
    public JsonResultVO Sendmsg(String phonenum){

        try {
            //生成6位验证码
            String verifyCode = String.valueOf(new Random().nextInt(899999) + 100000);
            ZhenziSmsClient client = new ZhenziSmsClient("https://sms_developer.zhenzikj.com","101569","292573e4-dd21-4a94-867a-fa7c65bd89b6");
            String result=client.send(phonenum,"你的验证码为"+verifyCode);
            resultVO.setCode(0);
            resultVO.setData("发送成功");
            resultVO.setVerifyCode(verifyCode);
        }catch (Exception e){
            e.printStackTrace();
            resultVO.setCode(1);
            resultVO.setData("发送失败");
        }

        return resultVO ;
    }
      @RequestMapping("login")
      @ResponseBody
    public JsonResultVO login(String phonenum,String verifyCode){

           try{
               String verifyCode1 = resultVO.getVerifyCode();
            if(verifyCode1.equals(verifyCode)){
               User user = loginmsgService.querybytel(phonenum);
               System.out.println(user.getPhone());
                   resultVO.setCode(2);
                   resultVO.setData("登录成功");
               }

           }catch (Exception e){
               e.printStackTrace();
               resultVO.setCode(3);
               resultVO.setData("验证码错误");
           }
            return  resultVO ;
    }
}
