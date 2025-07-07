package com.stit.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class NotificationService {

    @Autowired
    @Qualifier("smsService")
    private final MessageService messageService;

    public NotificationService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUsers(){
        messageService.sendMessage("This is a test message.");
    }
}
