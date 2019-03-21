package com.springboot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.UserRepository;
import com.springboot.model.Login;
import com.springboot.model.User;

@Service
public class UserServiceImple implements UserService {
	@Autowired
	  public UserRepository userrepository;

	  public void addUser(User user) {
	    userrepository.save(user);
	  }

	  public User validateUser(Login login) {
	    return userrepository.findById(login.getUsername()).get();
	  }

	}