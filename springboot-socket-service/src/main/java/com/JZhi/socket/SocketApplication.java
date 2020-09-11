package com.JZhi.socket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SocketApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SocketApplication.class, args);
        applicationContext.getBean(SocketServer.class).start();
    }
}
