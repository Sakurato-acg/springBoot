package com.itheima.bean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.stereotype.Component;

@Component("tom")
//@ConditionalOnBean(name="jerry")
@ConditionalOnWebApplication
//@ConditionalOnNotWebApplication
public class Cat {
}
