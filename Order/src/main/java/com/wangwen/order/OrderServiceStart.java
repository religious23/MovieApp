package com.wangwen.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xc-ww
 * @version : V1.0
 * @className: OrderServiceStart
 * @description: TODO
 * @date 2022-03-15
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.wangwen.order.mapper")
public class OrderServiceStart {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceStart.class);
    }
}
