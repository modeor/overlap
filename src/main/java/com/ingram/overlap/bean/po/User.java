package com.ingram.overlap.bean.po;

import lombok.Data;

import java.math.BigInteger;

/**
 * Description:用户实体
 * date: 2019-07-16 17:34
 *
 * @author: hx
 * @version: 1.0
 **/
@Data
public class User {
    private BigInteger userId;
    private String userName;
    private String password;
    private String passwordSalt;
    private int locked;
}
