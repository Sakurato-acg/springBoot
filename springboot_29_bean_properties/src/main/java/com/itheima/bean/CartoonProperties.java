package com.itheima.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "cartoon")
@Data
public class CartoonProperties {

//    @Value("{Cat}")
    private Cat cat;

//    @Value("{Mouse}")
    private Mouse mouse;
}
