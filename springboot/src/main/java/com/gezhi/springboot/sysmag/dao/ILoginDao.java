package com.gezhi.springboot.sysmag.dao;

import com.gezhi.springboot.bean.UserBean;

public interface ILoginDao {
	
	/**
	 * 登录方法
	 * @param user
	 * @return
	 */
	UserBean login(UserBean user);
}
