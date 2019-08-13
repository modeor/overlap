package com.ingram.overlap.application.dao;

import com.ingram.overlap.domain.user.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
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
 * author: hx
 * version: 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest()
@EnableAutoConfiguration
public class UserDaoTest {

    @Test
    @Transactional
    public void crdTest(){
    }

}
