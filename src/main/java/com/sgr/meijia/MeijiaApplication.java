package com.sgr.meijia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class MeijiaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeijiaApplication.class, args);
    }
}
