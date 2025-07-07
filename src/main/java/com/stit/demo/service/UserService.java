package com.stit.demo.service;

import com.stit.demo.domain.User;
import com.stit.demo.exception.UserNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserService {

    private final static List<User> USERS = new ArrayList<>();

    private boolean containsUser(User user){
        return USERS.contains(user) || USERS.stream().anyMatch(u -> u.getId() == user.getId());
    }

    public void addUser(User user){
        if(containsUser(user)){
            System.out.println("User "+user.getName()+" is already added.");
        }else{
            USERS.add(user);
        }
    }

    public List<User> getUsersByDomainName(String domainName){
        return USERS.stream().filter(u -> u.getEmail().endsWith("@"+domainName))
                .collect(Collectors.toList());
    }


    public List<User> getUsersByNameLength(int nameLength){
        return USERS.stream().filter(u-> u.getName().length() == nameLength)
                .collect(Collectors.toList());
    }


    public User getUserById(int id){
        return USERS.stream().filter(user -> user.getId() == id)
                .findFirst().orElseThrow(() -> new UserNotFoundException("User with ID "+id+" is not found."));
    }



}
