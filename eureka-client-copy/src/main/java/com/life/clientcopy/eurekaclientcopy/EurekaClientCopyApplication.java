package com.life.clientcopy.eurekaclientcopy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientCopyApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientCopyApplication.class, args);
	}

}
