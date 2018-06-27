package com.whj.eureka.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
    public String home() {
        if ("8762".equals(port)) {
            throw new NullPointerException();
        }
        return "hello world from port " + port;
    }
}
