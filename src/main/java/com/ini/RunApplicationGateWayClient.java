package com.ini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class RunApplicationGateWayClient {

	public static void main(String[] args) {
		SpringApplication.run(RunApplicationGateWayClient.class, args);
	}
	
}
