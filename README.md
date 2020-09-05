#springboot入门详解

##前言

为了更加简单直接的学习和了解springboot 及 其中的一些技术，于是在博客和自己的理解下写下了这个demo。希望demo对于刚接触springboot的读者有一定的帮助。

##介绍

项目包括了一些在springboot中比较常用的技术。

##mybatis-plus

###引包

mybatis-plus 整合 springboot 

    <!--  mybatis-plus -->
    <dependency>
        <groupId>com.baomidou</groupId>
        <artifactId>mybatis-plus-boot-starter</artifactId>
        <version>${mybatis-plus-boot-starter.version}</version>
    </dependency>
   
mybatis-plus 代码生成器 和模板引擎（如果不需要逆向工程，可以不用，才上手不建议使用）
 
    <!-- springboot整合freemarker -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-freemarker</artifactId>
    </dependency>

    <!--  mybatis-plus 代码生成器 -->
    <dependency>
        <groupId>com.baomidou</groupId>
        <artifactId>mybatis-plus-generator</artifactId>
        <version>3.3.2</version>
    </dependency>

##AOP

##shiro


