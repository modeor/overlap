package com.ingram.overlap.Reaml;

import com.ingram.overlap.bean.po.User;
import com.ingram.overlap.dao.UserDao;
import org.apache.shiro.authc.*;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Description:
 * date: 2019-07-16 17:17
 *
 * @author: hx
 * @version: 1.0
 **/
public class UserRealm extends AuthenticatingRealm {

    private static Logger log = LoggerFactory.getLogger(UserRealm.class);
    @Autowired
    private UserDao userDao;

    /**
     * Description 权限认证
     * date 2019/07/16 17:19
     *
     * @param authenticationToken
     * @return
     * @author hx
     **/
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        log.info("登录认证");
        String userName = (String) authenticationToken.getPrincipal();
        String password = new String((char[]) authenticationToken.getCredentials());
        User user = userDao.findUserByName(userName);
        ByteSource salt = ByteSource.Util.bytes(user.getPasswordSalt());
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user.getUserName(), user.getPassword(),salt, getName());
        return info;
    }
}
