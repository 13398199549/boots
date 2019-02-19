package com.gezhi.springboot.usermag.dao;

import com.gezhi.springboot.bean.UserBean;

public interface IUserDao {

	void saveUserBean(UserBean user);
	void updateUserBean(UserBean user);
	void deleteUserBean(UserBean user);
	UserBean getUserBeanById(Long id);
	
	
}
