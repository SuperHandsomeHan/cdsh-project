package com.bimda.cdshproject;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @PACKAGE_NAME: bimda.cdshproject
 * @NAME: BimdaManagementApplication
 * @USER: code.rookie
 * @DATE: 2020/11/10
 * @TIME: 10:49 上午
 * @DAY_NAME_SHORT: 周二
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.bimda.cdshproject.mapper", "com.baomidou.mybatisplus.samples.quickstart.mapper"})
//扫描所有包以及相关组件包
//@ComponentScan( basePackages = {"com.imooc","org.n3r.idworker"})
@EnableScheduling
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
