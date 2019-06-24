package com.obs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ObsApiClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObsApiClientApplication.class, args);
	}

}
