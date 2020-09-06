package com.example.eurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author caizhenya
 * @Date 2020/8/31
 * @Descrition
 **/
@RestController
public class HelloController {

//    @Autowired
//    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/")
    public Object index() {
        return "hello service";
    }

//    @RequestMapping("/info")
//    public Object info() {
//        return discoveryClient.getServices();
//    }

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "caizy") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

}