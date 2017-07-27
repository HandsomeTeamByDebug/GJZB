package com.lnsf.dao;

import org.apache.ibatis.annotations.Update;

import com.lnsf.entity.Project;
import com.lnsf.entity.Type;

/**
* @author 黄浩贡
* @version 创建时间：2017年7月27日10:29:21
* @introduction  实现project的修改操作
*/
public interface ProjectDao {
	
	//根据Id修改项目名字
	@Update("update gjzb_project set projectName =#{projectName} where projectId =#{projectId}")
	public int updateProjectNameById(Project project);
	
	//根据Id修改截止时间
	@Update("update gjzb_project set lastTime =#{lastTime} where projectId =#{projectId}")
	public int updateProjectLastTimeById(Project project);
	
	//根据Id修改项目标价
	@Update("update gjzb_project set price =#{price} where projectId =#{projectId}")
	public int updateProjectPriceById(Project project);
	

}
