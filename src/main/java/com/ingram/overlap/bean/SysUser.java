package com.ingram.overlap.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

/**
 * Description:
 * date: 2019-03-27 11:08
 *
 * @author: hx
 * @version: 1.0
 **/
@Data
public class SysUser {
    private Long userId;
    private String userName;
    private String password;
}
