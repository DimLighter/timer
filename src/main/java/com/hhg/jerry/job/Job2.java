package com.hhg.jerry.job;

/**
 * Created by lining on 2018/9/28.
 */
public class Job2 {
    public void doJob(){
        System.out.println(this.getClass().getSimpleName() + " " + Thread.currentThread().getStackTrace()[1].getMethodName() + " executed .");
    }
}
