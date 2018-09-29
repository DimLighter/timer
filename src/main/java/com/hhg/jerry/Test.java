package com.hhg.jerry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lining on 2018/9/28.
 */
public class Test {
    private static Logger logger = LoggerFactory.getLogger(Test.class);
    public static void main(String[] args){

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml","spring-time.xml");
        logger.info("spring initialized...");
    }
}
