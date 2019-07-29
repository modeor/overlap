package com.ingram.overlap.server;

import com.ingram.overlap.bean.vo.UserInfo;
import org.springframework.stereotype.Service;

/**
 * Description:
 * date: 2019-07-16 15:20
 *
 * @author: hx
 * @version: 1.0
 **/
public interface LoginService {
    void register(UserInfo userInfo);

    void modifyUser(UserInfo userInfo);
}
