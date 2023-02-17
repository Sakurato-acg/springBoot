package com.itheima;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "spring.datasource")
public class MyDatasource {

    private String type;
//    private String driver-class-name;
    private String url;
    private String username;
    private String password;
}
