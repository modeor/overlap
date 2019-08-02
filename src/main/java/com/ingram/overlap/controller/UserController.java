package com.ingram.overlap.controller;

import com.ingram.overlap.bean.vo.UserInfo;
import com.ingram.overlap.server.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:用户
 * date: 2019-07-16 11:26
 *
 * @author: hx
 * @version: 1.0
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    private static Logger log = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping("/modifyUser")
    public void modifyUser(@RequestBody UserInfo userInfo) {
        userService.modifyUser(userInfo);
    }
}
