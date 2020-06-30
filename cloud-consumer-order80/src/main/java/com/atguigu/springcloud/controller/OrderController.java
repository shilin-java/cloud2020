package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.common.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author: lin.shi
 * @Date: 2020/6/21 12:18 上午
 * @Describe:
 */
@RestController
public class OrderController {

//    public static final String PARYMENT_URL="http://localhost:8001";

public static final String PARYMENT_URL="http://cloud-payment-service";//使用注册中心的服务名称(名称不区分大小写)


    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/consumer/payment/create")
    public CommonResult<Payment> create(@RequestBody  Payment payment){
        restTemplate.postForObject(PARYMENT_URL+"/payment/create",payment,CommonResult.class);
        return restTemplate.postForObject(PARYMENT_URL+"/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> get(@PathVariable("id") Long id){
        return restTemplate.getForObject(PARYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }
}
