//package com.JZhi.quartz.simple;
//
//import org.quartz.JobExecutionContext;
//import org.springframework.scheduling.quartz.QuartzJobBean;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//public class DateTimeJob extends QuartzJobBean {
//
//    @Override
//    protected void executeInternal(JobExecutionContext jobExecutionContext){
//        //获取JobDetail中关联的数据
//        String msg = (String) jobExecutionContext.getJobDetail().getJobDataMap().get("msg");
//        System.out.println("current time :"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + " --- " + msg);
//    }
//}
