package com.lnsf.service;

import java.util.List;




import com.lnsf.entity.Project;
import com.lnsf.entity.Type;
import com.lnsf.entity.User;

/**
* @author 黄浩贡
* @version 创建时间：2017年7月27日10:31:46
* @introduction  增加几个关于项目修改的方法
*/
public interface ProjectService {
	
	//修改项目名字，截止时间，项目标价
	public int updateProjectName(Project project);
	public int updateProjectLastTime(Project project);
	public int updateProjectPrice(Project project);
	
}
