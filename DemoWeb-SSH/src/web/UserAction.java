/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package web;

import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import entity.UserInfo;
import service.UserService;

/**
 * Project:BankWeb
 * Package:web
 * FileName:UserAction.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-3-3 下午4:45:37
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
@SuppressWarnings("serial")
public class UserAction extends ActionSupport implements SessionAware{

	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	private UserInfo u;

	public UserInfo getU() {
		return u;
	}

	public void setU(UserInfo u) {
		this.u = u;
	}
	
	private Map<String, Object> session;

	@Override
	public void setSession(Map<String, Object> se) {
		session=se;
	}
	
	public String login(){
		return LOGIN;
	}
	
	public String doLogin(){
		UserInfo user = userService.getUser(u);
		if(user==null){
			return LOGIN;
		}else {
			session.put("user", user);
			return "doLogin_success";
		}
	}
	
}
