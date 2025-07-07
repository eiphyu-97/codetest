package com.stit.demo.service;

import org.springframework.context.annotation.Primary;

public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending EMAIL : "+ message);
    }
}
