package com.ingram.overlap.infrastructure.shiro;

import com.ingram.overlap.application.repository.UserRepository;
import com.ingram.overlap.domain.user.User;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;


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
    private UserRepository userRepository;

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
        Optional<User> optionalUser = userRepository.findByUserName(userName);
        if (!optionalUser.isPresent()) {
            throw new AuthenticationException("用户不存在");
        }

        User user = optionalUser.get();
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user.getUserName(), user.getPassword(), getName());
        return info;
    }
}
