package com.springboot.rest.service;

import java.util.List;

import com.springboot.rest.model.User;

public interface UserService {

	public List<User> findAll();
}
