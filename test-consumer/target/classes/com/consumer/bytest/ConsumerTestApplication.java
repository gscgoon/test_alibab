package com.consumer.bytest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.consumer.bytest.mapper")
public class ConsumerTestApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ConsumerTestApplication.class,args);
    }

}