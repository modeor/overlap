package com.ingram.overlap.controller;

import com.ingram.overlap.bean.vo.LoginParam;
import com.ingram.overlap.server.LoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:用户登录
 * date: 2019-07-16 11:26
 *
 * @author: hx
 * @version: 1.0
 **/
@RestController
@RequestMapping("/sys")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    public String login(@RequestBody LoginParam param){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(param.getUserName(), param.getPassword());
        subject.login(token);
        return "ok";
    }

    @RequestMapping("/addUser")
    public void addUser(){

    }

    @RequestMapping("/modifyUser")
    public void modifyUser(){

    }
}
