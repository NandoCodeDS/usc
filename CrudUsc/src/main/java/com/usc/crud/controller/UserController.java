package com.usc.crud.controller;

import com.usc.crud.model.User;
import com.usc.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private  UserService service;


    @GetMapping("/user")
    public ResponseEntity<?> filtrar(@PathVariable User user){
        return ResponseEntity.ok(service .finByUser(user));
    }
}
