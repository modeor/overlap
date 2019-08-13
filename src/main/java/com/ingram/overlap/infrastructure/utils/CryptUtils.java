package com.ingram.overlap.infrastructure.utils;

import org.apache.shiro.crypto.hash.Md5Hash;

public class CryptUtils {

    public static String encryptWithSalt(String password, String salt) {
        Md5Hash md5Hash = new Md5Hash(password, salt);
        Md5Hash md5Hash2 = new Md5Hash(md5Hash.toHex(), salt + salt + password);
        return md5Hash2.toHex();
    }

    public static void main(String[] args) {
        System.out.println(encryptWithSalt("123", "22"));
    }
}
