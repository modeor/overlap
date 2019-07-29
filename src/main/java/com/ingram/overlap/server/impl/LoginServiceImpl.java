package com.ingram.overlap.server.impl;

import com.ingram.overlap.bean.po.User;
import com.ingram.overlap.bean.vo.UserInfo;
import com.ingram.overlap.dao.UserDao;
import com.ingram.overlap.server.LoginService;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Description:
 * date: 2019-07-18 16:49
 *
 * @author: hx
 * @version: 1.0
 **/
@Service
public class LoginServiceImpl implements LoginService {

    private Logger log = LoggerFactory.getLogger(LoginServiceImpl.class);
    @Autowired
    private UserDao userDao;

    @Override
    public void register(UserInfo userInfo) {
        User user = new User();
        user.setUserName(userInfo.getUserName());
        String md5Hash = new Md5Hash(userInfo.getPassword(), userInfo.getUserName()).toString();
        user.setPassword(md5Hash);
        user.setPasswordSalt(userInfo.getUserName());
        user.setLocked(1);
        int insert = userDao.insert(user);
    }

    @Override
    public void modifyUser(UserInfo userInfo) {
        User user = new User();
        user.setUserName(userInfo.getUserName());
        String md5Hash = new Md5Hash(userInfo.getPassword(), userInfo.getUserName()).toString();
        user.setPassword(md5Hash);
        user.setPasswordSalt(userInfo.getUserName());
        user.setLocked(1);

        int insert = userDao.update(user);
    }
}
