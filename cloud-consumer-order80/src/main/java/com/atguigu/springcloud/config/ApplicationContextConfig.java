package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
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
    @LoadBalanced //开启负载均衡的调用(如果是通过服务的名称调用，也要添加这个注解)
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
