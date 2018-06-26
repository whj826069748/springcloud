package com.example.helloworld.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class HelloController {

    @Value("${hello}")
    String hello;

    @RequestMapping(value = "/hello")
    public String hello() {
        return hello;
    }
}
