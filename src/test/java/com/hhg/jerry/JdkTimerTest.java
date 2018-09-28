package com.hhg.jerry;

import org.junit.Test;

import java.util.Date;

/**
 * Created by lining on 2018/9/28.
 */
public class JdkTimerTest {

    @Test
    public void scheduleDelay(){
        JdkTimer.scheduleDelay(1000);
        sleep(1100L);
    }

    @Test
    public void scheduleAtTimeTest(){
        Date date = new Date(System.currentTimeMillis() + 2000L);
        JdkTimer.scheduleAtTime(date);
        sleep(2200L);
    }

    @Test
    public void scheduleAtFixRateByDelayTest(){
        JdkTimer.scheduleAtFixRateByDelay(3000L, 2000L);
        sleep(20000L);
    }

    @Test
    public void scheduleAtFixRateByFirstTimeTest(){
        Date date = new Date(System.currentTimeMillis() + 2000L);
        JdkTimer.scheduleAtFixRateByFirstTime(date, 2500L);
        sleep(20000L);
    }

    private void sleep(Long ms){
        try {
            Thread.sleep(ms);
            System.out.println("Sleep ms:" + ms + " and then executed at " + new Date().toString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
