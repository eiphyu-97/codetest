package com.stit.demo.config;

import com.stit.demo.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeansConfig {

    @Bean
    public SMSService smsService(){
        return new SMSService();
    }

    @Bean
    @Primary
    public EmailService emailService(){
        return new EmailService();
    }

    @Bean
    public NotificationService notificationService(MessageService messageService){
        return new NotificationService(messageService);
    }

    @Bean
    public UserService userService(){
        return new UserService();
    }
}
