# Quartz调度框架

## 引言
定时任务调度是Java开发中不可或缺的重要部分，但是Java自带的Time等任务调度类在实际项目中不好用。所以Quartz和Spring Task就成了我们项目开发技术选型最多的，这里我们着重探讨一下Quartz在Spring Boot2.X版本中的使用。

## Quartz

### 介绍
Quartz是OpenSymphony开源组织在Job scheduling领域的开源项目,它可以与J2EE与J2SE应用程序相结合也可以单独使用。Quartz可以用来创建简单或为运行十个，百个，甚至是好几万个Jobs这样复杂的日程序表。Jobs可以做成标准的Java组件或 EJBs。
Quartz是一个任务日程管理系统，一个在预先确定（被纳入日程）的时间到达时，负责执行（或者通知）其他软件组件的系统。
Quartz用一个小Java库发布文件（.jar文件），这个库文件包含了所有Quartz核心功能。这些功能的主要接口(API)是Scheduler接口。它提供了简单的操作，例如：将任务纳入日程或者从日程中取消，开始/停止/暂停日程进度。

### 核心概念
- **Job** :  表示一个工作，要执行的具体内容。
- **JobDetail** :  表示一个具体的可执行的调度程序，Job 是这个可执行程调度程序所要执行的内容，另外 JobDetail 还包含了这个任务调度的方案和策略。
- **Trigger** :  代表一个调度参数的配置，什么时候去调。
- **Scheduler** :  代表一个调度容器，一个调度容器中可以注册多个 JobDetail 和 Trigger。当 Trigger 与 JobDetail 组合，就可以被 Scheduler 容器调度了。 
### 运行环境
1. Quartz 可以运行嵌入在另一个独立式应用程序。
2. Quartz 可以在应用程序服务器(或 servlet 容器)内被实例化，并且参与 XA 事务。
3. Quartz 可以作为一个独立的程序运行(其自己的 Java 虚拟机内)，可以通过 RMI 使用。
4. Quartz 可以被实例化，作为独立的项目集群(负载平衡和故障转移功能)，用于作业的执行。

### 使用流程

**添加依赖**

    <!-- quartz依赖 -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-quartz</artifactId>
    </dependency>
