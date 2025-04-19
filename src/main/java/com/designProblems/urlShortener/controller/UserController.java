package com.designProblems.urlShortener.controller;

import com.designProblems.urlShortener.entity.UserTable;
import com.designProblems.urlShortener.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.http.ResponseEntity;



@RestController
@RequestMapping("/api/v1")
class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/getUser")
    public ResponseEntity<UserTable> getUserData(@RequestParam("id") long id){
       UserTable user  = userService.getuser(id);
       if(user == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }else{
        return new ResponseEntity(user,HttpStatus.OK);
       }
    }
}