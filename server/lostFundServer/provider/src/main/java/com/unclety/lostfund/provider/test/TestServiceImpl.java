package com.unclety.lostfund.provider.test;

import com.alibaba.dubbo.config.annotation.Service;
import com.unclety.lostfund.api.test.TestService;
import org.springframework.stereotype.Component;

@Service
@Component
public class TestServiceImpl implements TestService {
    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
