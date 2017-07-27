package com.lnsf.test.daoTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lnsf.dao.UserDao;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class UserDaoTest {

	@Autowired
	private UserDao userdao;
	@Test
	public void testGetUserById() {
		try{
			System.out.println(userdao.getUserById(2));
			
		}catch(Exception e){
			e.printStackTrace();
			fail("Not yet implemented");
		}
	}

	@Test
	public void testGetAllUser() {
		try{
			System.out.println(userdao.getAllUsers());
			
		}catch(Exception e){
			e.printStackTrace();
			fail("Not yet implemented");
		}
	}
	/*
	@Test
	public void testDeleteUserById() {
		try{
			System.out.println(userimpl.deleteUserById(1));
			
		}catch(Exception e){
			e.printStackTrace();
			fail("Not yet implemented");
		}
	}*/
	
	
}
