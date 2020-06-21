package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: lin.shi
 * @Date: 2020/6/15 1:25 下午
 * @Describe:
 */
@SpringBootApplication
public class PaymentMain8081 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8081.class,args);
        System.out.println("========payment启动成功========");
    }
}
