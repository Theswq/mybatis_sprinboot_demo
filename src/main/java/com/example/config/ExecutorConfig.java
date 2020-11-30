//package com.example.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
//
//import java.util.concurrent.Executor;
//import java.util.concurrent.ThreadPoolExecutor;
//
//@Configuration
//public class ExecutorConfig {
//    //配置线程池--线程池01
//    @Bean("executor1")
//    public Executor executor1() {
//        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
//        executor.setThreadNamePrefix("test-schedule1-");
//        executor.setMaxPoolSize(20);
//        executor.setCorePoolSize(15);
//        executor.setQueueCapacity(0);
//        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
//        return executor;
//    }
//}
