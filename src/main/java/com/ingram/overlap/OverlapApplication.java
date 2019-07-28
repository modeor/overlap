package com.ingram.overlap;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ingram.overlap.dao")
public class OverlapApplication {
    public static void main(String[] args) {
        SpringApplication.run(OverlapApplication.class, args);
    }
}
