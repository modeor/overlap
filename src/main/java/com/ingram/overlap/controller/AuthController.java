package com.ingram.overlap.controller;

import org.springframework.stereotype.Controller;
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
    private String loginUrl = "/login.html";

    @RequestMapping(value = "/")
    public String index(){
        return loginUrl;
    }
}
