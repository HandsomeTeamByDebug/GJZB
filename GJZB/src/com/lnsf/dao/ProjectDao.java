package com.lnsf.dao;

import org.apache.ibatis.annotations.Update;

import com.lnsf.entity.Project;
import com.lnsf.entity.Type;

public interface ProjectDao {
	
	@Update("update gjzb_project set projectName =#{projectName} where projectId =#{projectId}")
	public int updateProjectNameById(Project project);
	
	@Update("update gjzb_project set lastTime =#{lastTime} where projectId =#{projectId}")
	public int updateProjectLastTimeById(Project project);
	
	@Update("update gjzb_project set price =#{price} where projectId =#{projectId}")
	public int updateProjectPriceById(Project project);
	
	@Update("update gjzb_type set projectType=#{projectType} where typeId=#{typeId}")
	public int updateprojectTypeById(Type type);
}
