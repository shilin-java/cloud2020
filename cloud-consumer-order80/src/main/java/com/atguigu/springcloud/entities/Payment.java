package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: lin.shi
 * @Date: 2020/6/21 12:05 上午
 * @Describe:
 */
@Data
@AllArgsConstructor //全参数注解
@NoArgsConstructor //无参数
public class Payment  implements Serializable {
    private Long id;
    private String serial;
}
