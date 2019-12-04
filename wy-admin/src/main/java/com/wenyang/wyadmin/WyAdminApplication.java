package com.wenyang.wyadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WyAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(WyAdminApplication.class, args);
    }

}
