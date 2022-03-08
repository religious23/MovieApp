package com.wangwen.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author W.Wen
 * @version : V1.0
 * @className: EurekaServiceStart
 * @description: Eureka启动类
 * @date 2022-01-05
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceStart {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceStart.class);
    }
}
