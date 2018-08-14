package com.wen.springboot.service.impl;

import com.wen.springboot.domain.Student;
import com.wen.springboot.mapper.StudentMapper;
import com.wen.springboot.service.IStudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements IStudentService
{
    @Resource
    private StudentMapper studentMapper;

    public void addStudent(Student student)
    {
        studentMapper.add(student);
    }
}
