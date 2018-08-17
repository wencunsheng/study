package com.wen.springboot.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("Student")
@ToString
public class Student
{
    private Long id;
    private String name;
    private String age;
}
