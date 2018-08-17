package com.wen.springboot.mapper;

import com.wen.springboot.domain.Student;

import java.util.List;
import java.util.Map;

public interface StudentMapper
{
    void add(Student student);

    List<Student> get(List<Integer> list);

    List<Student> getMap(Map<String ,Object> map);
}
