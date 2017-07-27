package com.lnsf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnsf.dao.UserDao;
import com.lnsf.entity.User;
import com.lnsf.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userDao.getAllUsers();
	}

	@Override
	public User getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return userDao.getUserById(userId);
	}
	public int addOneUser(User user){
		return userDao.addOneUser(user);
	}
}
