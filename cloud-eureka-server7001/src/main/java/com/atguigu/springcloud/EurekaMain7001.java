package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * @Author: lin.shi
 * @Date: 2020/6/21 1:42 下午
 * @Describe:
 */
@SpringBootApplication
@EnableEurekaServer //表明是注册中心的服务端
public class EurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class,args);
        System.out.println("========服务端启动成功  7001========");
    }
}