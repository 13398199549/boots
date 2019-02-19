package com.gezhi.springboot.sysmag.service;

import com.gezhi.springboot.bean.UserBean;

public interface ILoginService {
	
	/**
	 * 登录方法
	 * @param user
	 * @return
	 */
	UserBean login(UserBean user);
}
