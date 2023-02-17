package com.itheima;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.config.ServletConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(ServletConfig.class)
public class Springboot0302ConfigurationApplication {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DruidDataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName("com.mysql.cj.jdbc,");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/anime_library?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true&nullCatalogMeansCurrent=true");
//        dataSource.setUsername("2120400146");
//        dataSource.setPassword("210019");
        return dataSource;
    }
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Springboot0302ConfigurationApplication.class, args);
        DruidDataSource bean = run.getBean(DruidDataSource.class);
        System.out.println(bean.getPassword());
    }

}
