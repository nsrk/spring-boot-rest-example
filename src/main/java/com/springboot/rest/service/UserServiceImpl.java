package com.springboot.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.rest.model.User;

@Service("userService")
public class UserServiceImpl implements UserService {

	public List<User> findAll()
	{
		List<User> usersList = new ArrayList<User>();
		
		User user = new User();
		user.setUserId("1");
		user.setUserName("Siva");
		usersList.add(user);
		User user1 = new User();
		user1.setUserId("2");
		user1.setUserName("Rama");
		usersList.add(user1);
		
		return usersList;
	}
}
