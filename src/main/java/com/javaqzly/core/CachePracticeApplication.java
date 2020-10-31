package com.javaqzly.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import com.javaqzly.config.CacheConfig;

@SpringBootApplication(scanBasePackages = {"com.javaqzly"})
@EnableCaching
public class CachePracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CacheConfig.class, args);
    }

}
