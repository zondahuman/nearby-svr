package com.abin.lee.nearby.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by abin on 2018/7/4.
 */
@Slf4j
@SpringBootApplication
public class NearbyApplication {


    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(NearbyApplication.class, args);
        String[] activeProfiles = ctx.getEnvironment().getActiveProfiles();
        for (String profile : activeProfiles) {
            log.warn("---------Spring Boot 使用profile为:{}" , profile);
        }

        SpringApplication.run(NearbyApplication.class, args);
    }


}
