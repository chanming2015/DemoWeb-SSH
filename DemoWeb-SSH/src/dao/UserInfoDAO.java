/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package dao;

import java.util.List;
import entity.UserInfo;

/**
 * Project:BankWeb
 * Package:dao
 * FileName:UserInfoDAO.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-3-3 下午4:07:35
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
@SuppressWarnings("unchecked")
public class UserInfoDAO extends BaseDAO{

	/**
	 * @author XuMaoSen
	 * Create Time:2015-3-3 下午4:58:27
	 * Description
	 * @param u
	 * @return
	 */
	public UserInfo selectUser(UserInfo u){
		return (UserInfo) getCurrentSession().createQuery("from UserInfo u where u.username=? and u.password=? ").setString(0, u.getUsername()).setString(1, u.getPassword()).list().get(0);
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-3-3 下午5:42:13
	 * Description
	 * @param name 
	 * @return
	 */
	public List<UserInfo> selectOtherUser(String name){
		return  getCurrentSession().createQuery("from UserInfo u where u.username != ? ").setString(0, name).list();
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-3-3 下午5:56:02
	 * Description
	 * @param string
	 * @param d
	 * @return
	 */
	public int modifyUserjian(String name, double money){
		return  getCurrentSession().createQuery("update UserInfo u set u.money = (u.money - ?) where u.username = ? ").setDouble(0, money).setString(1, name).executeUpdate();
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-3-3 下午6:02:30
	 * Description
	 * @param username
	 * @param money
	 * @return
	 */
	public int modifyUserjia(String name, double money){
		return  getCurrentSession().createQuery("update UserInfo u set u.money = (u.money + ?) where u.username = ? ").setDouble(0, money).setString(1, name).executeUpdate();
	}

}
