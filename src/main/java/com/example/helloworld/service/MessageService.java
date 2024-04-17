package com.example.helloworld.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private static Logger log= LoggerFactory.getLogger(MessageService.class);
    public String getMessage(){
        log.info("I am in getmessage method ");
        return "Hello Spring Boot World";
    }
}