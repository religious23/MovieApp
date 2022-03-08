package com.wangwen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @author W.Wen
 * @version : V1.0
 * @className: ConsumerServiceStart
 * @description: 电影消费启动类
 * @date 2022-01-05
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
@EnableHystrixDashboard
@MapperScan("com.wangwen.user.mapper")
public class UserServiceStart {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceStart.class);
    }
}
