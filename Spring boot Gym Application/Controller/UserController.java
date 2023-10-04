package com.gymwebsite.gym.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gymwebsite.gym.Entities.User;
import com.gymwebsite.gym.Services.UserServices;

import jakarta.validation.Valid;

@RestController
public class UserController {
    
    @Autowired
    UserServices userServices;

    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@Valid @RequestBody User user){
        return new ResponseEntity<User>(userServices.addUser(user),HttpStatus.CREATED);
    }

    @GetMapping("/getUserDetail/{gId}")
    public ResponseEntity<User> getUserDetail(@PathVariable("gId") int gId){
        return new ResponseEntity<User>(userServices.getUserDetail(gId),HttpStatus.OK);
    }
}
