/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package entity;

import java.io.Serializable;

/**
 * Project:AMSWeb
 * Package:com.dyr.team1.xms.amsw.entity
 * FileName:RoleMenu.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-2-24 下午7:55:09
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
@SuppressWarnings("serial")
public class RoleMenu implements Serializable {
	
	private Integer id;
	private Role role;
	private Menu menu;
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
	 * @return the role
	 */
	public Role getRole() {
		return role;
	}
	/**
	 * Author XuMaoSen
	 * @param role the role to set
	 */
	public void setRole(Role role) {
		this.role = role;
	}
	/**
	 * Author XuMaoSen
	 * @return the menu
	 */
	public Menu getMenu() {
		return menu;
	}
	/**
	 * Author XuMaoSen
	 * @param menu the menu to set
	 */
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
}
