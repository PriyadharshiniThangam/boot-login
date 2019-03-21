package com.springboot.service;
import com.springboot.model.Login;
import com.springboot.model.User;

public interface UserService {
	void addUser(User user);

	  User validateUser(Login login);
}
