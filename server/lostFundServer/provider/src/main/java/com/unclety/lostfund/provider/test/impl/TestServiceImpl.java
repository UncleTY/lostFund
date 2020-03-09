package com.unclety.lostfund.provider.test.impl;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.alibaba.dubbo.config.annotation.Service;
import com.unclety.lostfund.api.test.TestService;
import org.springframework.stereotype.Component;

@Service(version = "1.0.0")
@Component
public class TestServiceImpl implements TestService {
    private Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);
    @Override
    public String sayHello(String name) {
        logger.info("hello in");
        return "Hello," + name;
    }
}
