package com.ini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.ini.filter.AccessFilter;

@EnableZuulProxy
@SpringBootApplication
public class RunApplicationClient {

	public static void main(String[] args) {
		SpringApplication.run(RunApplicationClient.class, args);
	}
	
	@Bean
	public AccessFilter accessFiter(){
		return new AccessFilter();
	}
	
}
