package com.ingram.overlap.dao;

import com.ingram.overlap.bean.po.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Description:
 * date: 2019-07-16 17:33
 *
 * @author: hx
 * @version: 1.0
 **/
@Mapper
public interface UserDao {
    public User findUserByName(String userName);
}
