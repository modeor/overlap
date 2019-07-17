package com.ingram.overlap.dao;

import com.ingram.overlap.bean.po.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

/**
 * Description:UserDaoTest
 * date: 2019-07-17 16:16
 *
 * @author: hx
 * @version: 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest()
@EnableAutoConfiguration
public class UserDaoTest {
    @Autowired
    UserDao userDao;
    @Test
    @Transactional
    public void crdTest(){
        User user = new User();
        user.setUserName("test");
        user.setPassword("123");
        user.setPasswordSalt("321");
        user.setLocked(1);
        int insert = userDao.insert(user);
        Assert.assertEquals(1,insert);
        User fundUser = userDao.findUserByName(user.getUserName());
        Assert.assertEquals(user.getUserId(),fundUser.getUserId());
        ArrayList<User> userList = new ArrayList<>();
        userList.add(fundUser);
        int delete = userDao.delete(userList);
        Assert.assertEquals(1,delete);
    }

}
