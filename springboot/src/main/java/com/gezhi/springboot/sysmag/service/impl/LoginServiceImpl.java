package com.gezhi.springboot.sysmag.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gezhi.springboot.bean.UserBean;
import com.gezhi.springboot.sysmag.dao.ILoginDao;
import com.gezhi.springboot.sysmag.service.ILoginService;

@Transactional(readOnly=true)
@Service
public class LoginServiceImpl implements ILoginService {

	@Resource
	private ILoginDao loginDaoImpl;
	
	@Override
	public UserBean login(UserBean user) {
		// TODO Auto-generated method stub
		return loginDaoImpl.login(user);
	}

}
