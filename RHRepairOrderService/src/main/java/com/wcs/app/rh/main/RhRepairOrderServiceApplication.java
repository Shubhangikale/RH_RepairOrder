package com.wcs.app.rh.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication

public class RhRepairOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhRepairOrderServiceApplication.class, args);
	}

}
