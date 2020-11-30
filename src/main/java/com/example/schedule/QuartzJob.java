//package com.example.schedule;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.scheduling.annotation.Async;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//import java.util.Date;
//
//@Component
//public class QuartzJob {
//    private static final Logger LOGGER = LoggerFactory.getLogger(QuartzJob.class);
//
//    @Async("executor1")
//    @Scheduled(cron = "*/10 * * * * ?")
//    public void test01(){
//        LOGGER.info("test01---"+new Date());
//        return;
//    }
//
//    @Async
//    @Scheduled(cron = "*/10 * * * * ?")
//    public void test02(){
//        LOGGER.info("test02---"+new Date());
//        return;
//    }
//
//    @Async
//    @Scheduled(cron = "*/10 * * * * ?")
//    public void test03(){
//        LOGGER.info("test03---"+new Date());
//        return;
//    }
//}
