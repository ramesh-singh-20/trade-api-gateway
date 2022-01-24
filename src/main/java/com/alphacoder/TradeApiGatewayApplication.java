package com.alphacoder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TradeApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradeApiGatewayApplication.class, args);
	}

}
