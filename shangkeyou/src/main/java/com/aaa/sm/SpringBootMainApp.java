package com.aaa.sm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * className:SpringBootMainApp
 * discriptoin:
 * author:张晓峰
 * createTime:2018-11-20 11:01
 */
@EnableTransactionManagement//开启注解式事务
@SpringBootApplication
@MapperScan("com.aaa.sm.dao")
public class SpringBootMainApp {
    /**
     * 主函数
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringBootMainApp.class);
    }
}
