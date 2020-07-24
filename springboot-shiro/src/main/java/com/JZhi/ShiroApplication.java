package com.JZhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.com.JZhi.project.mapper") //扫描mapper类生成代理对象
public class ShiroApplication {
	public static void main(String[] args) {
		SpringApplication.run(ShiroApplication.class, args);
	}
}
