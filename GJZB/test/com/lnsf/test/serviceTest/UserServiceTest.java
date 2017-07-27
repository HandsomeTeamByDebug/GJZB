package com.lnsf.test.serviceTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lnsf.service.impl.UserServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class UserServiceTest {

	@Autowired
	private UserServiceImpl userServiceImpl;
	@Test
	public void testGetUserById() {
		try{
			System.out.println(userServiceImpl.getUserById(2));
			
		}catch(Exception e){
			e.printStackTrace();
			fail("Not yet implemented");
		}
	}
	
	@Test
	public void testGetAllUser() {
		try{
			System.out.println(userServiceImpl.getAllUsers());
			
		}catch(Exception e){
			e.printStackTrace();
			fail("Not yet implemented");
		}
	}

}
