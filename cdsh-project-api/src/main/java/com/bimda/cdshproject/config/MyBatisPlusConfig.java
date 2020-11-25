package com.bimda.cdshproject.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.config
 * @NAME: MyBatisPlusConfig
 * @USER: Han
 * @DATE: 2020/11/24
 * @TIME: 15:07
 * @DAY_NAME_SHORT: 周二
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */

@Configuration
public class MyBatisPlusConfig {

    /**
     * 分页插件
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}
