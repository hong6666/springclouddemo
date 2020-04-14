package com.life.clould.springcloulddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringcloulddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloulddemoApplication.class, args);
    }

}
