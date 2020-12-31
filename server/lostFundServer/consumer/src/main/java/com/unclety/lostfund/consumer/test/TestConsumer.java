package com.unclety.lostfund.consumer.test;

import com.alibaba.dubbo.config.annotation.Reference;
import com.unclety.lostfund.api.test.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConsumer {
    private static Logger logger = LoggerFactory.getLogger(TestConsumer.class);
    @Reference
    private TestService testService;

    @RequestMapping(value = "/hello")
    public String hello() {
        System.out.println("master");
        System.out.println("merge");
        String hello = testService.sayHello("world");
        System.out.println(testService.sayHello("BJQ"));
        return hello;
    }
}
