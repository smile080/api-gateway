package com.ini.filter;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;

@Component
public class ThrowExceptionFilter extends ZuulFilter {

	private static final Logger log = LoggerFactory.getLogger(ThrowExceptionFilter.class);
	
	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		log.info("this is a pre filter,it will throw a RuntimeException.");
		doSomething();
		return null;
	}

	private void doSomething() {
		throw new RuntimeException("Exist some errors......");
	}

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

}
