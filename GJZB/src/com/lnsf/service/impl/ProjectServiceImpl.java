package com.lnsf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnsf.dao.ProjectDao;
import com.lnsf.entity.Project;
import com.lnsf.entity.Type;
import com.lnsf.entity.User;
import com.lnsf.service.ProjectService;


/**
* @author 黄浩贡
* @version 创建时间：2017年7月27日10:46:31
* @introduction  增加projectservice实现类
*/
@Service("projectService")
public class ProjectServiceImpl implements ProjectService{

	@Autowired
	private ProjectDao projectDao;
	

	@Override
	public int updateProjectName(Project project) {
		// TODO Auto-generated method stub
		return projectDao.updateProjectNameById(project);
	}


	@Override
	public int updateProjectLastTime(Project project) {
		// TODO Auto-generated method stub
		return projectDao.updateProjectLastTimeById(project);
	}


	@Override
	public int updateProjectPrice(Project project) {
		// TODO Auto-generated method stub
		return projectDao.updateProjectPriceById(project);
	}


}
