package com.wen.springboot;

import com.wen.springboot.domain.Student;
import com.wen.springboot.service.IStudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {
    @Resource
    IStudentService studentService;

    @Test
    public void contextLoads() {
		/*Student student = new Student();
		student.setAge("18");
		student.setName("1");
        studentService.addStudent(student);*/
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        List<Student> students = studentService.get(list);
        for (Student student : students) {
            System.out.println(student);
        }
    }
    @Test
    public void getMap() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Map<String, Object> map = new HashMap<>();
        map.put("qwe", list);
        map.put("asd", "65");
        List<Student> students = studentService.getMap(map);
        for (Student student : students) {
            System.out.println(student);
        }
    }

}
