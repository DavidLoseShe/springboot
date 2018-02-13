package com.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.springboot.mapper")
@SpringBootApplication
public class FirstspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstspringbootApplication.class, args);
	}
}