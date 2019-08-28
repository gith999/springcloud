
package com.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "springcloud-client", fallback = FeignHelloServiceFallback.class) //用于通知Feign组件对该接口进行代理(不需要编写接口实现)， SERVICE-AB代理的具体服务
public interface FeignHelloService {

	@RequestMapping("/testb") //对应具体服务中的接口地址（具体服务controller 层的暴露接口）
    public String testB(@RequestParam("cusId")String cusId);


}
