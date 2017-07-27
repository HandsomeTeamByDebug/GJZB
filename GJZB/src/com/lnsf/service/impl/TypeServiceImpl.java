package com.lnsf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnsf.dao.TypeDao;
import com.lnsf.entity.Type;
import com.lnsf.service.TypeService;

/**
* @author 黄浩贡
* @version 创建时间：2017年7月27日10:46:31
* @introduction  增加typeservice实现类
*/
@Service("typeService")
public class TypeServiceImpl implements TypeService{
	
	@Autowired
	private TypeDao typeDao;
	
	@Override
	public int updateprojectType(Type type) {
		// TODO Auto-generated method stub
		return typeDao.updateprojectTypeById(type);
	}

}
