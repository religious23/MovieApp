package com.wangwen.movie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author W.Wen
 * @version : V1.0
 * @className: ProviderServiceStart
 * @description: 电影服务启动类
 * @date 2022-01-05
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.wangwen.movie.mapper")
public class MovieServiceStart {
    public static void main(String[] args) {
        SpringApplication.run(MovieServiceStart.class);
    }
}
