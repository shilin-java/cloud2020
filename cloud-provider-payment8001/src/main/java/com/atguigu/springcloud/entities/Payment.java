package com.atguigu.springcloud.entities;

/**
 * @Author: lin.shi
 * @Date: 2020/6/17 10:30 下午
 * @Describe: 实体类
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@AllArgsConstructor //全参数注解
@NoArgsConstructor //无参数
public class Payment  implements Serializable {
    private Long id;
    private String serial;
}
