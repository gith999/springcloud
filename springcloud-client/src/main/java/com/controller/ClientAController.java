
package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientAController {

	@RequestMapping("/info")
    public String testA() {
        return "testA - springcloud-client !!! ";
    }
	
	@RequestMapping("/testb")
    public String testB(@RequestParam("cusId")String cusId) {
        return "testB - springcloud-client !!! "; 
    }

}
