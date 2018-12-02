package com.wen.springboot.service.impl;

import com.wen.springboot.domain.Student;
import com.wen.springboot.mapper.StudentMapper;
import com.wen.springboot.service.IStudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements IStudentService {
    @Resource
    private StudentMapper studentMapper;

    @Transactional(readOnly = true, propagation= Propagation.REQUIRED)
    public void addStudent(Student student) {
        studentMapper.add(student);
    }

    @Override
    public List<Student> get(List<Integer> list) {
        return studentMapper.get(list);
    }

    @Override
    public List<Student> getMap(Map<String, Object> map) {
        return studentMapper.getMap(map);
    }
}
