package com.lnsf.entity;

public class Type {
	private Integer typeId;      //主键ID
	private Project projectType;   //项目合同对象
	
	public Type() {
		super();
	}
	public Type(Integer typeId, Project projectType) {
		super();
		this.typeId = typeId;
		this.projectType = projectType;
	}
	
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	public Project getProjectType() {
		return projectType;
	}
	public void setProjectType(Project projectType) {
		this.projectType = projectType;
	}
	@Override
	public String toString() {
		return "Type [typeId=" + typeId + ", projectType=" + projectType + "]";
	}

}
