package com.lnsf.test.daoTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lnsf.dao.EmployeeDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class EmployeeDaoTest {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@Test
	public void getMaxEmpno(){
		try {
			//Œ∞¡·
			int i = employeeDao.getMaxEmpno();
			System.out.println(i);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
