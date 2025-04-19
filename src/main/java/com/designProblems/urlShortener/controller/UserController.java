package com.designProblems.userShortener.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Autowired;
import org.springframework.http.ResponseEntity;



@RestController
@RequestMapping("/api/v1/user")
class UserController {
    @GetMapping("/getUser")
    @Autowired
    UserService userService;
    private ResponseEntity<UserTable> getUserData(@RequestMapping("id") long id){
       UserTable user  = userService.getuser(id);
       if(user == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }else{
        return new ResponseEntity(user,HttpStatus.OK);
       }
    }
}