package com.wen.springboot.controller;

import com.wen.springboot.domain.Student;
import com.wen.springboot.service.IStudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StudentController
{
    @Resource
    private IStudentService studentService;
    private Logger l = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/index")
    public String index()
    {
        l.info("666666666666666666666666666666666");
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
