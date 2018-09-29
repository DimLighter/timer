package com.hhg.jerry;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by lina on 2018/9/29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-time.xml")
public class SpringTimerTest {
    @Test
    public void quartzTest () throws Exception{
        Thread.sleep(10);
    }
}
