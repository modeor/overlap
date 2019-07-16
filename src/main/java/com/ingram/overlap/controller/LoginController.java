package com.ingram.overlap.controller;

import com.ingram.overlap.bean.vo.LoginParam;
import com.ingram.overlap.server.LoginService;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:用户登录
 * date: 2019-07-16 11:26
 *
 * @author: hx
 * @version: 1.0
 **/
@Controller
@RestController("/sys")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    public void login(LoginParam param){
        new
        SecurityUtils.setSecurityManager(securityManager);
    }

    @RequestMapping("/addUser")
    public void addUser(){

    }

    @RequestMapping("/modifyUser")
    public void modifyUser(){

    }
}
