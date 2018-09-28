package com.hhg.jerry.springtime.xml;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by lina on 2018/9/28.
 */
@Component
public class SpringXMLTask1 {
    public void doJob(){
        System.out.println("Thread:" + Thread.currentThread().getName() + " " +
                this.getClass().getSimpleName() + " " +
                Thread.currentThread().getStackTrace()[1].getMethodName() +
                " executed at " + new Date().toString());
    }
}
