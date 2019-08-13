package com.ingram.overlap.application.service;

import com.ingram.overlap.application.repository.UserRepository;
import com.ingram.overlap.domain.user.User;
import com.ingram.overlap.infrastructure.exception.ResultCodeEnum;
import com.ingram.overlap.infrastructure.exception.SystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


/**
 * Description:
 * date: 2019-07-18 16:49
 *
 * @author: hx
 * @version: 1.0
 **/
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findUserByName(String userName) {
        Optional<User> optional = userRepository.findByUserName(userName);
        if (!optional.isPresent()) {
            throw new SystemException(ResultCodeEnum.USER_NOT_FOUND, "未找到用户");
        }
        return optional.get();
    }
}
