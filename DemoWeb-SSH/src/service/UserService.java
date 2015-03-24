/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package service;

import dao.UserInfoDAO;
import entity.UserInfo;

/**
 * Project:BankWeb
 * Package:service
 * FileName:UserService.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-3-3 下午4:43:04
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
public class UserService {
	
	private UserInfoDAO userInfoDAO;
	
	public UserInfoDAO getUserInfoDAO() {
		return userInfoDAO;
	}
	public void setUserInfoDAO(UserInfoDAO userInfoDAO) {
		this.userInfoDAO = userInfoDAO;
	}
	/**
	 * @author XuMaoSen
	 * Create Time:2015-3-3 下午4:57:57
	 * Description
	 * @param u
	 * @return
	 */
	public UserInfo getUser(UserInfo u) {
		
		return userInfoDAO.selectUser(u);
	}
}
