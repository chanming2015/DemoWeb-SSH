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
 * Project:BankWeb
 * Package:entity
 * FileName:UserInfo.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-3-3 下午4:04:57
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
@SuppressWarnings("serial")
public class UserInfo implements Serializable{
	
	private Integer id;
	private String username;
	private String password;
	private Role role;
	
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * Project:SSH-QX
	 * Package:entity
	 * FileName:UserInfo.java
	 * Comments:
	 * JDK Version:
	 * Author XuMaoSen
	 * Create Date:2015-3-12 下午6:04:52
	 * Modified By:XuMaoSen
	 * Modified Time:
	 * What is Modified:
	 * Version:
	 */
	public UserInfo() {
	}
	
}
