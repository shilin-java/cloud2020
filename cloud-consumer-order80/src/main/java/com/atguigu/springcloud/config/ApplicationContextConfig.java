package com.atguigu.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: lin.shi
 * @Date: 2020/6/21 12:07 上午
 * @Describe: 引入 RestTemplate ,方便调用rest API接口。底层是对HttpClient的封装
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
