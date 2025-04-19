package com.designProblems.urlShortener.service;

import com.designProblems.urlShortener.entity.UserTable;
import com.designProblems.urlShortener.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;


@Service
public class UserService {
     @Autowired
     private UserRepository userTableRepository;
     public UserTable getuser(long id){
        Optional<UserTable> user = Optional.ofNullable(userTableRepository.findById(id));
        if(user.isPresent()) {
            return user.get();
        }else{
            return null;
        }
     }
}