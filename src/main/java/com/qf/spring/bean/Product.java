package com.qf.spring.bean;

import lombok.Data;
import org.springframework.stereotype.Component;


@Component
@Data
public class Product {
    private String addr;
    private Integer phone;
}
