package com.wen.springboot.controller;

import com.wen.springboot.domain.Student;
import com.wen.springboot.service.IStudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StudentController
{
    @Resource
    IStudentService studentService;

    @RequestMapping(value = "/index")
    public String index()
    {
        Student student = new Student();
        student.setAge("18");
        student.setName("12");
        studentService.addStudent(student);
        return "ok";
    }
    @RequestMapping("/hello")
    public String hello()
    {
        Student student = new Student();
        student.setAge("18");
        student.setName("12");
//        studentService.addStudent(student);
        return "ok";
    }
}
