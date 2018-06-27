package com.example.springcloudhelloworldfeignclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "SERVICE-HELLOWORLD", fallback = HelloWorldServiceFailure.class)
public interface HelloWorldService {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String sayHello();

}
