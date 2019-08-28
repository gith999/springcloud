package com.service;
import org.springframework.stereotype.Component;
@Component
public class FeignHelloServiceFallback implements FeignHelloService{

	@Override
	public String testB(String cusId) {
		return cusId;
	}
	
}
