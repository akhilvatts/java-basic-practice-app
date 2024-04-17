package com.example.helloworld.api;

import com.example.helloworld.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Autowired
    private MessageService messageService;

    @GetMapping("/message")
    public String getMessage(){
        return messageService.getMessage();
    }
}