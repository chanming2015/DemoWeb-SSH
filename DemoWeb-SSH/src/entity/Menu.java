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
 * Project:AssetManagementSystemWeb
 * Package:com.dyr.team1.xms.amsw.entity
 * FileName:Menu.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-2-10 下午5:36:59
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
@SuppressWarnings("serial")
public class Menu implements Serializable {
	
	private Integer id;
	private String name;
	private Menu supper;
	private String methodName;
	private Set<RoleMenu> roleMenus = new HashSet<RoleMenu>();

	/**
	 * Author XuMaoSen
	 * @return the methodName
	 */
	public String getMethodName() {
		return methodName;
	}
	/**
	 * Author XuMaoSen
	 * @param methodName the methodName to set
	 */
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Author XuMaoSen
	 * @return the supper
	 */
	public Menu getSupper() {
		return supper;
	}
	/**
	 * Author XuMaoSen
	 * @param supper the supper to set
	 */
	public void setSupper(Menu supper) {
		this.supper = supper;
	}
	
}
