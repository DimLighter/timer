package com.hhg.jerry.springtime.annotation;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by lina on 2018/9/28.
 */
@Component
public class SpringAnnotationTask {
    @Scheduled(cron = "0/4 * * * * *")
    public void doJob(){
        System.out.println("Thread:" + Thread.currentThread().getName() + " " +
                this.getClass().getSimpleName() + " " +
                Thread.currentThread().getStackTrace()[1].getMethodName() +
                " executed at " + new Date().toString());
    }
}
