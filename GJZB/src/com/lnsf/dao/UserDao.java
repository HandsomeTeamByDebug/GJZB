package com.lnsf.dao;



import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.lnsf.entity.User;
/**
* @author 劳伟玲 
* @version 创建时间：2017年7月26日21:29:22
* @introduction  创建用户接口UserDao，注解实现用户信息的查询和删除
*/
public interface UserDao {
	//查询全部用户信息
	@Select("select * from gjzb_user")
	List<User> getAllUsers();
	
	//按用户id查询单个用户信息
	@Select("select * from gjzb_user where userId=#{userId}")
	User getUserById(Integer userId);
	
	//按用户id删除个人用户信息
	//@Delete("delete from gjzb_user where userId=#{userId}")
	//int deleteUserById(Integer userId);
	

}
