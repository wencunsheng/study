package com.wen.springboot.springbootmybatis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController
{
    @RequestMapping(value = "/index")
    public String index()
    {
        return "index";
    }
}
