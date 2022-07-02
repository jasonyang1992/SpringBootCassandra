package com.hotel.controller;

import com.hotel.model.Users;
import com.hotel.services.impl.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Users/Api")
public class UsersController {

    @Autowired
    private UsersServiceImpl usersService;

    @GetMapping
    public List<Users> getAllUsers() {
        return usersService.getAllUsers();
    }

    @PostMapping
    public ResponseEntity<Users> createUser(@RequestBody Users users) {
        return new ResponseEntity<>(usersService.createUser(users), HttpStatus.CREATED);
    }

    @PutMapping
    public List<Users> createMultipleUsers(@RequestBody List<Users> users){
        return usersService.createMultipleUsers(users);
    }

}
