package com.hotel.services.impl;

import com.hotel.model.Users;
import com.hotel.repository.UsersRepo;
import com.hotel.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepo usersRepo;

    @Override
    public List<Users> getAllUsers() {
        return usersRepo.findAll();
    }


    @Override
    public Users createUser(Users users) {
        return usersRepo.save(users);
    }

    @Override
    public List<Users> createMultipleUsers(List<Users> users) {
        return usersRepo.saveAll(users);
    }
}
