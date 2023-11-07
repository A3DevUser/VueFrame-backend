package com.Backend.VueFrame;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration    
@EnableAsync
    public class AsyncConfig {

        @Bean(name="taskExecutor")
        public ThreadPoolTaskExecutor taskExecutor() {
            ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
            executor.setQueueCapacity(50);
            executor.setMaxPoolSize(50);
            executor.setCorePoolSize(50);
            executor.setThreadNamePrefix("ThreadPool = ");
            executor.initialize();
            return executor;
        } 
        
        
        
    } 