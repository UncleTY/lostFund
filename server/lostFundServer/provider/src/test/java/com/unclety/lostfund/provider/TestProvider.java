package com.unclety.lostfund.provider;

import com.unclety.lostfund.api.test.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Provider.class)
public class TestProvider {
    private static final Logger logger = LoggerFactory.getLogger(TestProvider.class);
    @Autowired
    private TestService testService;

    @Test
    public void test() {
        System.out.println(testService.sayHello("world"));
        logger.info(testService.sayHello("world"));
    }
}
