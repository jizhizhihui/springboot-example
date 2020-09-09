package com.JZhi.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledService {
    /**
     * second (秒), minute(分), hour(时), day of month(天), month(月), day of week(周几)
     * 0 * * * * MON-FRI   //周一到周六 每一分钟 0 秒时
     *
     *  举几个例子
     *       [ 0  0/5  14,18  *  *  ? ]  每天14点整，18点整，每隔5分钟执行一次
     *       [ 0  15  10  ?  *  1-6 ]  每个月的周一到周六10点15分执行一次
     *       [ 0  0  2  ?  *  6L ]  每个月的最后一个周六2点执行一次
     *       [ 0  0  2  LW  *  ? ]  每个月的最后一个工作日2点执行一次
     *       [ 0  0  2-4  ?  *  1#1 ]  每个月第一个周一2点到4点期间，每个整点执行一次，应该是三次2点、3点、4点
     */
//    @Scheduled(cron = "0 * * * * 1-7")   每天每时每分整 执行一次
//    @Scheduled(cron = "0,1,2,3,4 * * * * MON-SAT")
//    @Scheduled(cron = "0-4 * * * * MON-SAT")
    @Scheduled(cron = "0/4 * * * * MON-SAT")  //每 4 秒执行一次
    public void hello() {
        System.out.println("hello ... scheduled");
    }
}

