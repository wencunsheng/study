package com.wen.springboot.service;

import com.wen.springboot.domain.Student;

import java.util.List;
import java.util.Map;

public interface IStudentService {
    void addStudent(Student student);

    List<Student> get(List<Integer> list);

    List<Student> getMap(Map<String, Object> map);
}
