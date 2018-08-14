package com.wen.springboot.domain;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("Student")
public class Student
{
    private Long id;
    private String name;
    private String age;
}
