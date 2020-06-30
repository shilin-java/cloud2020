package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.common.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author: lin.shi
 * @Date: 2020/6/19 4:59 下午
 * @Describe:
 */
@RestController
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        if(result<1){
            return new CommonResult(500,"插入失败");
        }else
            return new CommonResult(200,"插入成功");
    }
    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> get(@PathVariable("id") Long id) {
        Payment paymentById = paymentService.getPaymentById(id);

        if(paymentById==null){
            return new CommonResult(500,"查询失败");
        }else
            return new CommonResult(200,"查询成功:port:8001",paymentById);
    }
}
