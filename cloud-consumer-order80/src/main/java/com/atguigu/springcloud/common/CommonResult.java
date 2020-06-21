package com.atguigu.springcloud.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: lin.shi
 * @Date: 2020/6/17 10:34 下午
 * @Describe: 公共返回类
 */
@Data
@AllArgsConstructor //全参数注解
@NoArgsConstructor //无参数
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code,message,null);
    }
}
