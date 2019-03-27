package com.damon.springbootmybatis;

import com.damon.springbootmybatis.mappers.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMybatisApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisApplication.class, args);
    }

    @Autowired
    PersonMapper mapper;

    @Override
    public void run(String... args) throws Exception {
        //注解配置sql query
        System.out.println(mapper.getNameById(1));
        //xml配置sql query
        System.out.println(mapper.getPersonById(2));
    }
}
