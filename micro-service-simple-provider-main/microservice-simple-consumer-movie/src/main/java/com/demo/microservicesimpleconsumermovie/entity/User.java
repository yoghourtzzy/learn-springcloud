package com.demo.microservicesimpleconsumermovie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @program: micro-service-simple-provider-main
 * @description:
 * @author: zzy
 * @create: 2019-05-20 21:19
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private String username;
    private String name;
    private Integer age;
    private BigDecimal balance;
}


