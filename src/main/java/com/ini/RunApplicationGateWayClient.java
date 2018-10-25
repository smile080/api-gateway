package com.ini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.ini.filter.AccessFilter;

@EnableZuulProxy
@SpringBootApplication
public class RunApplicationGateWayClient {

	public static void main(String[] args) {
		SpringApplication.run(RunApplicationGateWayClient.class, args);
	}
	
	@Bean
	public AccessFilter accessFiter(){
		return new AccessFilter();
	}
	
}
