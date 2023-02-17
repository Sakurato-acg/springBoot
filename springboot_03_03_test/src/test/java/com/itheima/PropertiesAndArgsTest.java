package com.itheima;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {"test.prop=value1"}, args = {"--test.prop=value2"})
public class PropertiesAndArgsTest {

    @Value("${test.prop}")
    private String prop;

    @Test
    void test() {
        System.out.println("prop = " + prop);
    }
}
