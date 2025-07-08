package com.stit.demo;

import com.stit.demo.config.BeansConfig;
import com.stit.demo.domain.User;
import com.stit.demo.exception.UserNotFoundException;
import com.stit.demo.service.NotificationService;
import com.stit.demo.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeansConfig.class);
        NotificationService notificationService = applicationContext.getBean(NotificationService.class);
        notificationService.notifyUsers();

        //UserService userService = applicationContext.getBean(UserService.class);

//        User user1 = new User(1, "Ko Ko" , "koko@example.com");
//        User user2 = new User(2, "Bo Bo" , "bobo@example.com");
//        User user3 = new User(3, "Kyaw Kyaw" , "kk@example.com");
//        User user4 = new User(4, "Soe Soe" , "soe@sample.com");
//        User user5 = new User(5, "Khant Khant" , "khant@sample.com");
//
//        userService.addUser(user1);
//        userService.addUser(user2);
//        userService.addUser(user3);
//        userService.addUser(user4);
//        userService.addUser(user5);
//
//        notificationService.notifyUsers();
//
//        List<User> usersWithDomain = userService.getUsersByDomainName("example.com");
//        usersWithDomain.forEach(System.out::println);
//
//        try{
//
//            userService.getUserById(99);
//        }catch (UserNotFoundException ex){
//            System.out.println(ex.getMessage());
//        }


    }
}
