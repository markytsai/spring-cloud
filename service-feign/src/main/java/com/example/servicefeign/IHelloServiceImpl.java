package com.example.servicefeign;

import org.springframework.stereotype.Component;

@Component
public class IHelloServiceImpl implements IHelloService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "fail..." + name;
    }
}
