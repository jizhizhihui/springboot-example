package com.JZhi.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {

    @Async  //异步方法
    public void hello() {
        try {
            Thread.sleep(13000);
//            System.out.println("sleep after");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello 数据处理中");
    }
}
