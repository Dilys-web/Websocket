package com.jts.websocket_chat_application.controller;

import com.jts.websocket_chat_application.service.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmailController {

    @Autowired
    private  SendEmailService sendEmailService;

    @GetMapping("sendEmail")
    public String sendEmail() {
        sendEmailService.sendEmail("opokudonkord@gmail.com", "hello", "Test");
        return "Sent successfully";
    }
}
