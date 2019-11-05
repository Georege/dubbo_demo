package com.gly.impl;

import com.gly.service.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "I am watching you!!!";
    }
}
