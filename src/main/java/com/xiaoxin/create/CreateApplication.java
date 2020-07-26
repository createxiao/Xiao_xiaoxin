package com.xiaoxin.create;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.xiaoxin.create.dao"})
public class CreateApplication {

    public static void main(String[] args) {
        SpringApplication.run(CreateApplication.class, args);
    }

}
