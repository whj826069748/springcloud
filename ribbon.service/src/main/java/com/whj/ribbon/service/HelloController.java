package com.whj.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hi")
    public String hi(){
        return helloService.getHelloContent();
    }

}
