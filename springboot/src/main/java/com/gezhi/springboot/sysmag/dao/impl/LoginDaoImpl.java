package com.gezhi.springboot.sysmag.dao.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.gezhi.springboot.bean.UserBean;
import com.gezhi.springboot.sysmag.dao.ILoginDao;
import com.gezhi.springboot.sysmag.mapper.LoginMapper;

@Repository
public class LoginDaoImpl implements ILoginDao {

	@Resource
	private LoginMapper loginMapper;
	
	@Override
	public UserBean login(UserBean user) {
		// TODO Auto-generated method stub
		return loginMapper.login(user);
	}

}
