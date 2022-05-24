package com.ldzy.yiban;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ldzy.yiban.mapper")
public class YiBanApplication {

    public static void main(String[] args) {
        SpringApplication.run(YiBanApplication.class, args);
    }

}
