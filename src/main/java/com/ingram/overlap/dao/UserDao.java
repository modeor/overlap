package com.ingram.overlap.dao;

import com.ingram.overlap.bean.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Description:
 * date: 2019-07-16 17:33
 *
 * @author: hx
 * @version: 1.0
 **/
@Mapper
public interface UserDao {
    User findUserByName(@Param("username") String userName);

    int insert(@Param("user") User user);

    int delete(@Param("userList") List<User> userList);

    int update(@Param("user") User user);
}
