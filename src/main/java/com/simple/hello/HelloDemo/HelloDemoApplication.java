package com.simple.hello.HelloDemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.simple.hello.HelloDemo.mappers")
public class HelloDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloDemoApplication.class, args);
	}
}
