package com.unclety.lostfund.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubboConfiguration
@SpringBootApplication
public class Consumer {
    private static Logger logger = LoggerFactory.getLogger(Consumer.class);

    public static void main(String args[]) {
        SpringApplication.run(Consumer.class, args);
    }
}
