package com.lnsf.entity;

import java.sql.Date;

/**
* @author 黄卉 
* @version 创建时间：2017年7月26日 下午7:14:10
* @introduction  合同、项目的实体类
*/
public class Project {

	private Integer  projectId;
	private String projectName;
	private Date releaseTime;
	private Date lastTime;
	private String projectcontent;
	private double price;
	private Type type;
	private User user;
	
	public Project() {
		super();
	}

	public Project(Integer projectId, String projectName, Date releaseTime, Date lastTime, String projectcontent,
			double price, Type type, User user) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.releaseTime = releaseTime;
		this.lastTime = lastTime;
		this.projectcontent = projectcontent;
		this.price = price;
		this.type = type;
		this.user = user;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Date getReleaseTime() {
		return releaseTime;
	}

	public void setReleaseTime(Date releaseTime) {
		this.releaseTime = releaseTime;
	}

	public Date getLastTime() {
		return lastTime;
	}

	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}

	public String getProjectcontent() {
		return projectcontent;
	}

	public void setProjectcontent(String projectcontent) {
		this.projectcontent = projectcontent;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", releaseTime=" + releaseTime
				+ ", lastTime=" + lastTime + ", projectcontent=" + projectcontent + ", price=" + price + ", type="
				+ type + ", user=" + user + "]";
	}
}
