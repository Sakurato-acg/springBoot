package com.itheima.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *
 * </p>
 *
 * @author lpl
 * @since 2023-01-26
 */
@Data
@Repository
@ConfigurationProperties(prefix = "testcase.book")
public class BookTest {
    private Integer id;

    private String type;

    private String name;

    private String description;

}
