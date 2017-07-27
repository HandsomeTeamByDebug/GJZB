package com.lnsf.dao;

import org.apache.ibatis.annotations.Update;

import com.lnsf.entity.Type;

/**
* @author 黄浩贡
* @version 创建时间：2017年7月27日10:29:21
* @introduction  实现Type的修改操作
*/
public interface TypeDao {
	
	//根据Id修改项目类型
	@Update("update gjzb_type set projectType=#{projectType} where typeId=#{typeId}")
	public int updateprojectTypeById(Type type);
}
