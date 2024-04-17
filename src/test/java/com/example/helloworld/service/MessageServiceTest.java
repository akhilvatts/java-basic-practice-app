package com.example.helloworld.service;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest(classes = {MessageServiceTest.class})
public class MessageServiceTest {

    @InjectMocks
    private MessageService messageService;

    private static Logger log= LoggerFactory.getLogger(MessageServiceTest.class);

    @Test
    public void getMessageTest(){
        String expected_Result="Hello Spring Boot World";
        log.info("Test method executing ...");
        String actual_result=messageService.getMessage();
        assertEquals(expected_Result,actual_result);
    }

}
