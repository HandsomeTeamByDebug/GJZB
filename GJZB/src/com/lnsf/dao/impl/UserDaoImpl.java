package com.lnsf.dao.impl;

import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lnsf.dao.UserDao;
import com.lnsf.entity.User;

@Service
public class UserDaoImpl implements UserDao{
	@Autowired
	private UserDao userDao;

	@Override
	public User getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return userDao.getUserById(userId);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userDao.getAllUsers();
	}

	/*@Override
	public int deleteUserById(Integer userId) {
		// TODO Auto-generated method stub
		return userDao.deleteUserById(userId);
	}*/
	
	

}
