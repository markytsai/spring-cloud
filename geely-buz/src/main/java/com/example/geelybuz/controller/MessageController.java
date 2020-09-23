package com.example.geelybuz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author caizhenya
 * @Date 2020/9/23
 * @Descrition
 **/
@RestController
public class MessageController {



    @GetMapping("/sendMsg")
    public void sendMessage() {

    }
}
