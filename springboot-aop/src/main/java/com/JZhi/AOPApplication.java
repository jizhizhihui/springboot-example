package com.JZhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.JZhi.project.mapper")
public class AOPApplication {
	public static void main(String[] args) {
		SpringApplication.run(AOPApplication.class, args);
	}
}
