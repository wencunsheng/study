package com.wen.springboot;

import com.wen.springboot.domain.Student;
import com.wen.springboot.service.IStudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {
	@Resource
	IStudentService studentService;
	@Test
	public void contextLoads() {
		Student student = new Student();
		student.setAge("18");
		student.setName("1");
        studentService.addStudent(student);
	}

}
