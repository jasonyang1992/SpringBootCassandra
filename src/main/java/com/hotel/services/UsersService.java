package com.hotel.services;

import com.hotel.model.Users;

import java.util.List;

public interface UsersService {

    List<Users> getAllUsers();
    Users createUser(Users users);
    List<Users> createMultipleUsers(List<Users> users);
}
