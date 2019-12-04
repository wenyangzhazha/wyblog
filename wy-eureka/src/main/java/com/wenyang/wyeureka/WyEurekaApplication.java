package com.wenyang.wyeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WyEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(WyEurekaApplication.class, args);
    }

}
