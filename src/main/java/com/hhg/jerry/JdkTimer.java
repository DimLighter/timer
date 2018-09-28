package com.hhg.jerry;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by lining on 2018/9/28.
 */
public class JdkTimer {
    private static Timer timer = new Timer();
    public static void scheduleDelay(long delay){
        final String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(methodName + " executed at " + new Date().toString());
                System.out.println();
            }
        }, delay);
    }

    public static void scheduleAtTime(Date date){
        final String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(methodName + " executed at " + new Date().toString());
                System.out.println();
            }
        }, date);
    }

    public static void scheduleAtFixRateByDelay(long delay, long period){
        final String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(methodName + " start at " + new Date().toString());
                System.out.println(methodName + " finished at " + new Date().toString());
                System.out.println();
            }
        }, delay, period);
    }

    public static void scheduleAtFixRateByFirstTime(Date firstTime, long period){
        final String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(methodName + " executed at " + new Date().toString());
                System.out.println();
            }
        }, firstTime, period);
    }
}
