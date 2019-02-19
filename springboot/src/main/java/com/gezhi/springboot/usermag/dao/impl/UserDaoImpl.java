package com.gezhi.springboot.usermag.dao.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.gezhi.springboot.bean.UserBean;
import com.gezhi.springboot.usermag.dao.IUserDao;
import com.gezhi.springboot.usermag.mapper.UserMapper;

@Repository
public class UserDaoImpl implements IUserDao {

	@Resource
	private UserMapper userMapper;
	
	@Override
	public void saveUserBean(UserBean user) {
		// TODO Auto-generated method stub
		userMapper.saveUserBean(user);
	}

	@Override
	public void updateUserBean(UserBean user) {
		// TODO Auto-generated method stub
		userMapper.updateUserBean(user);
	}

	@Override
	public void deleteUserBean(UserBean user) {
		// TODO Auto-generated method stub
		userMapper.deleteUserBean(user);
	}

	@Override
	public UserBean getUserBeanById(Long id) {
		// TODO Auto-generated method stub
		return userMapper.getUserBeanById(id);
	}

}
