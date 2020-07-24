package com.JZhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= DataSourceAutoConfiguration.class)
public class AOPApplication {
	public static void main(String[] args) {
		SpringApplication.run(AOPApplication.class, args);
	}
}
