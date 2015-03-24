/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Project:DemoWeb-SSH
 * Package:entity
 * FileName:Role.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-3-12 ����3:22:27
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
@SuppressWarnings("serial")
public class Role implements Serializable{
	
	private Integer id;
	private String name;
	private Set<UserInfo> userInfos = new HashSet<UserInfo>();
	private Set<RoleMenu> roleMenus = new HashSet<RoleMenu>();
	
	/**
	 * Author XuMaoSen
	 * @return the roleMenus
	 */
	public Set<RoleMenu> getRoleMenus() {
		return roleMenus;
	}
	/**
	 * Author XuMaoSen
	 * @param roleMenus the roleMenus to set
	 */
	public void setRoleMenus(Set<RoleMenu> roleMenus) {
		this.roleMenus = roleMenus;
	}
	/**
	 * Author XuMaoSen
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * Author XuMaoSen
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * Author XuMaoSen
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Author XuMaoSen
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Author XuMaoSen
	 * @return the userInfos
	 */
	public Set<UserInfo> getUserInfos() {
		return userInfos;
	}
	/**
	 * Author XuMaoSen
	 * @param userInfos the userInfos to set
	 */
	public void setUserInfos(Set<UserInfo> userInfos) {
		this.userInfos = userInfos;
	}

}
