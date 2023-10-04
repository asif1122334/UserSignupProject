package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService{

 	    private final UserRepository userRepository;

	    @Autowired
	    public UserServiceImpl(UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }

	    @Override
	    public User signup(User user) {
	        // Implement user registration logic, including password hashing
	        // Save the user to the database
	        return userRepository.save(user);
	    }
	}
