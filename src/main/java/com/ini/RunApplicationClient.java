package com.ini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class RunApplicationClient {

	public static void main(String[] args) {
		SpringApplication.run(RunApplicationClient.class, args);
	}
}
