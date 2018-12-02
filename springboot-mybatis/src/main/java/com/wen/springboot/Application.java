package com.wen.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@MapperScan("com.wen.springboot.mapper")
@PropertySource(value={"classpath:config.properties"}, encoding="UTF-8")
public class Application
{
	//分支备注
	//分支备注2
	//主干备注4
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
