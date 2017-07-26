package com.lnsf.dao;

public class EmployeeDao {
	//获取Emp表中empno的最大值
		@Select("select max(empno) from emp")
		public int getMaxEmpno();
}
