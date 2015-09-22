package com.test.service;

import java.util.List;

import com.test.bean.User;

public interface UserService {
	public void save(User user);

	public List<User> findAll();
	
	public void delete(User user);
	
	public User findById(int id);
	
	public void update(User user);

}