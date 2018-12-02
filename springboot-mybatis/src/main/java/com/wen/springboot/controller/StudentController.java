package com.wen.springboot.controller;

import com.wen.springboot.domain.Student;
import com.wen.springboot.service.IStudentService;
import lombok.Getter;
import lombok.Setter;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    //测试分支修改
    @Value("${names}")
    private String name;
    @Value("${age}")
    private String age;
    @Resource
    private IStudentService studentService;
    private Logger l = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/index")
    public String index() {
        l.info("666666666666");
        Student student = new Student();
        student.setAge(age);
        student.setName(name);
        studentService.addStudent(student);
        return "ok";
    }

    @Setter
    @Getter
    List<String> list = new ArrayList<>();

    @RequestMapping("/hello")
    public String hello() {
        Student s = new Student();
        s.setName(list.get(0));
        s.setAge(list.get(1));
        studentService.addStudent(s);
        return "ok";
    }

    @RequestMapping("/word2")
    public void wordDemo(HttpServletResponse response) throws Exception {
        OutputStream os = response.getOutputStream();
//        response.setContentType("application/msword");
//        response.setHeader("Content-disposition","attachment;filename=测试.docx");
        String context = "666666666666666";
        InputStream is = new ByteArrayInputStream(context.getBytes("UTF-8"));
        POIFSFileSystem fs = new POIFSFileSystem();
//        DocumentEntry wordDocument = fs.createDocument(is, "WordDocument");
        fs.writeFilesystem(os);
    }
}
