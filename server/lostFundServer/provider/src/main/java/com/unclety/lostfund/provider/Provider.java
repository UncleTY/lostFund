package com.unclety.lostfund.provider;


import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubboConfiguration
@SpringBootApplication
public class Provider {
    /**
     * @param args 启动参数
     */
    public static void main(String[] args) {
        SpringApplication.run(Provider.class, args);
    }
}
