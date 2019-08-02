package com.ingram.overlap.server;

import com.ingram.overlap.bean.vo.UserInfo;

/**
 * Description:
 * date: 2019-07-16 15:20
 *
 * @author: hx
 * @version: 1.0
 **/
public interface UserService {
    void register(UserInfo userInfo);

    void modifyUser(UserInfo userInfo);
}
