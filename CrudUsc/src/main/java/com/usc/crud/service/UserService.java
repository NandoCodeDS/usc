package com.usc.crud.service;

import com.usc.crud.model.User;
import com.usc.crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public Optional<User> finByUser(User user){

        return repository.findById(user.getId());

    }
}
