package com.lnsf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnsf.dao.UserDao;
import com.lnsf.entity.User;
import com.lnsf.service.UserService;


/**
* @author 黄浩贡
* @version 创建时间：2017年7月27日10:46:31
* @introduction  增加修改用户操作的实现类
*/
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
	@Override
	public int updateUserName(User user) {
		// TODO Auto-generated method stub
		return userDao.updateUserNameByID(user);
	}

	@Override
	public int updateUserPw(User user) {
		// TODO Auto-generated method stub
		return userDao.updateUserPwByID(user);
	}

	@Override
	public int updateUserintroduc(User user) {
		// TODO Auto-generated method stub
		return userDao.updateUserIntroduByID(user);
	}
}
