package com.wangwen.ticket;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xc-ww
 * @version : V1.0
 * @className: TicketServiceStart
 * @description: 票服务启动类
 * @date 2022-03-14
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.wangwen.ticket.mapper")
public class TicketServiceStart {
    public static void main(String[] args) {
        SpringApplication.run(TicketServiceStart.class);
    }

}
