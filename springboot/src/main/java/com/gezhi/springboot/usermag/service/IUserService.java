package com.gezhi.springboot.usermag.service;

import com.gezhi.springboot.bean.UserBean;

public interface IUserService {

	void saveUserBean(UserBean user);
	void updateUserBean(UserBean user);
	void deleteUserBean(UserBean user);
	UserBean getUserBeanById(Long id);
	
	
}
