package com.jts.websocket_chat_application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class SendEmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String fromEmailId;

    public void sendEmail(String recipient, String body, String subject) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("opokudonkord@gmail.com");
        simpleMailMessage.setTo(recipient);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(body);
        javaMailSender.send(simpleMailMessage);


        System.out.println("Email sent");
    }
}
