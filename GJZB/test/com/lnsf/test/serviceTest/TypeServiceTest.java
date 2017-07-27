package com.lnsf.test.serviceTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lnsf.entity.Type;
import com.lnsf.service.TypeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class TypeServiceTest {

	@Autowired
	private TypeService typeService;
	
	@Test
	public void test() {
		try{
			Type type = new Type();
			type.setTypeId(1);
			type.setProjectType("admin23245");
			int count = typeService.updateprojectType(type);
			
			System.out.println(count);
		}catch(Exception e){
			e.printStackTrace();
		}
		fail("Not yet implemented");
	}

}
