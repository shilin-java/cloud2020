package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: lin.shi
 * @Date: 2020/6/17 10:39 下午
 * @Describe:
 */

@Mapper //推荐使用 mapper 注解
public interface PaymentDao {
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
    public Payment getPaymentById(@Param("id") Long id);

}
