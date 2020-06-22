package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

/**
 * @Author: lin.shi
 * @Date: 2020/6/19 2:51 下午
 * @Describe:
 */
public interface PaymentService {
    /**
     * 添加
     * @return
     */
    public int create(Payment payment);

    /**
     *
     * @param id
     * @return
     */
    public Payment getPaymentById(Long id);
}
