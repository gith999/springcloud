package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.FeignHelloService;
import com.service.HelloService;
@RestController
public class CustomerAController {

	@Autowired
	HelloService service;
	
	@Autowired
	FeignHelloService feignHelloService;
	 
    @RequestMapping("/ribbon-consumer")
    public String coutomerA() {
    	System.out.println("coutomerA");
        return service.helloService();
    }
    
    @RequestMapping("/ribbon-consumer-feign")
    public String coutomerB() {
        return feignHelloService.testB();
    }
}
