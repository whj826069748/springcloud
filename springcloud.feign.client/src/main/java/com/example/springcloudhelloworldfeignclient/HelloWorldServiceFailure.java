package com.example.springcloudhelloworldfeignclient;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldServiceFailure implements HelloWorldService {
    @Override
    public String sayHello() {
        return "hello world service is not available !";
    }
}
