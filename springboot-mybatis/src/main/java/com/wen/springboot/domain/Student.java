package com.wen.springboot.domain;

import lombok.Data;
import org.apache.ibatis.type.Alias;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Alias("Student")
@Data
@ConfigurationProperties(prefix = "com.wen.springboot.domain.Student")
public class Student
{
    private Long id;
    private String name;
    private String age;
}
