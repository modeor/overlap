package com.ingram.overlap.controller;

import com.ingram.overlap.bean.vo.LoginParam;
import com.ingram.overlap.bean.vo.UserInfo;
import com.ingram.overlap.server.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description: 权限控制层
 * date: 2019-08-01 09:53
 *
 * @author: hx
 * @version: 1.0
 **/
@Controller
public class AuthController {
    @Autowired
    private UserService userService;
    private String loginUrl = "/login.html";

    @RequestMapping(value = "/")
    public String index() {
        return loginUrl;
    }

    @RequestMapping("/login")
    public String login(@RequestBody LoginParam param) {
        if (StringUtils.isEmpty(param.getUserName()) || StringUtils.isEmpty(param.getPassword())) {
            return "用户名或密码不能为空";
        }
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(param.getUserName(), param.getPassword());
        try {
            subject.login(token);
        } catch (IncorrectCredentialsException e) {
            return "错误的凭证";
        } catch (AuthenticationException e) {
            return "身份认证失败";
        }
        return "index";
    }

    @RequestMapping("/register")
    public void register(@RequestBody UserInfo userInfo) {
        userService.register(userInfo);
    }

}
