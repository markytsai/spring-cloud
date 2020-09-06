package com.example.servicefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    private IHelloService iHelloService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return iHelloService.sayHiFromClientOne(name);
    }
}
