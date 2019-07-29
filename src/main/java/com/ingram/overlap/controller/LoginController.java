package com.ingram.overlap.controller;

import com.ingram.overlap.Reaml.UserRealm;
import com.ingram.overlap.bean.vo.LoginParam;
import com.ingram.overlap.bean.vo.UserInfo;
import com.ingram.overlap.server.LoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
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

    private static Logger log = LoggerFactory.getLogger(LoginController.class);
    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    public String login(@RequestBody LoginParam param){
        if (StringUtils.isEmpty(param.getUserName())||StringUtils.isEmpty(param.getPassword())){
            return "用户名或密码不能为空";
        }
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(param.getUserName(), param.getPassword());
        try {
            subject.login(token);
        }catch (IncorrectCredentialsException e){
            return "错误的凭证";
        }catch (AuthenticationException e ){
            return "身份认证失败";
        }
        return "ok";
    }

    @RequestMapping("/register")
    public void register(@RequestBody UserInfo userInfo){
        loginService.register(userInfo);
    }

    @RequestMapping("/modifyUser")
    public void modifyUser(@RequestBody UserInfo userInfo){
        loginService.modifyUser(userInfo);
    }
}
