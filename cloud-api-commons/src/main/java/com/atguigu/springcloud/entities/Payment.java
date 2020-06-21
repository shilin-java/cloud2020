package com.atguigu.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import lombok.AllArgsConstructor;


/**
 * @Author: lin.shi
 * @Date: 2020/6/21 11:37 上午
 * @Describe:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment  implements Serializable {
    private Long id ;
    private String serial;
}
