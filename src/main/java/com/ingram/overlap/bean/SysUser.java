package com.ingram.overlap.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Description:
 * date: 2019-03-27 11:08
 *
 * @author: hx
 * @version: 1.0
 **/
@Data
public class SysUser {
    private String userId;
    private String name;
    private String password;
    private int age;
}
