package com.stit.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class SMSService implements MessageService {

    private String message = "This is a test message from Component Bean.";

    @Override
    public void sendMessage() {
        System.out.println("Sending SMS : "+message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
