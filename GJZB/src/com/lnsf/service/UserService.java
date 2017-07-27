package com.lnsf.service;

import java.util.List;



import com.lnsf.entity.User;
/**
* @author 劳伟玲   
* @version 创建时间：2017年7月26日21:29:22
* @introduction  创建用户业务层接口UserService
*/

public interface UserService {
	//查询全部用户信息
	List<User> getAllUsers();
	
	//按用户id查询单个用户信息
	User getUserById(Integer userId);
	
	//修改用户名字，密码，个人简介
	public int updateUserName(User user);
	public int updateUserPw(User user);
	public int updateUserintroduc(User user);
	
	/**
	* @author 黄卉  
	* @version 创建时间：2017年7月27日11:01:12
	* @introduction  添加用户业务逻辑
	*/
	int addOneUser(User user);
}
