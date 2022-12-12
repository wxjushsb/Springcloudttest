package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableHystrix//用来实现服务熔断，降级
@SpringBootApplication
@EnableFeignClients//用来实现负载均衡
public class BorrowApplication {
    public static void main(String[] args) {
        SpringApplication.run(BorrowApplication.class,args);
    }
}
