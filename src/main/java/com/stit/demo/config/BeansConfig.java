package com.stit.demo.config;

import com.stit.demo.service.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.stit.demo")
public class BeansConfig {

    @Bean(name = "SMS")
    public SMSService smsService(){
        SMSService smsService = new SMSService();
        smsService.setMessage("This is a test message from Method Bean.");
        return smsService;
    }

    @Bean(name = "Email")
    public EmailService emailService(){
        EmailService emailService = new EmailService();
        emailService.setMessage("This is a test message from Method Bean");
        return emailService;
    }

    @Bean
    public NotificationService notificationService(@Qualifier("emailService") MessageService messageService){
        return new NotificationService(messageService);
    }

    @Bean
    public UserService userService(){
        return new UserService();
    }
}
