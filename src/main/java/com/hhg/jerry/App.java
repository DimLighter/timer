package com.hhg.jerry;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Timer timer = new Timer();
    public static void main( String[] args ) {
        final String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println(methodName + " start at " + new Date().toString());

        scheduleDelay(1000);
        Date date = new Date(System.currentTimeMillis() + 2000L);
        scheduleAtTime(date);

        scheduleAtFixRateByDelay(3000L, 2000L);
        scheduleAtFixRateByFirstTime(date, 2500L);

        System.out.println(methodName + " finish at " + new Date().toString());
        System.out.println();
    }

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
                System.out.println(methodName + " executed at " + new Date().toString());
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
