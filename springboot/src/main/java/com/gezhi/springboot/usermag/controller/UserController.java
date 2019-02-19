package com.gezhi.springboot.usermag.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gezhi.springboot.bean.ResMessage;
import com.gezhi.springboot.bean.UserBean;
import com.gezhi.springboot.usermag.service.IUserService;

@RequestMapping("/users")
@RestController
public class UserController {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Resource
	private IUserService userServiceImpl;
	
	@RequestMapping(value= {"/{id}"},method=RequestMethod.POST,produces= {"application/json;charset=utf-8"})
	public ResMessage saveUserBean(UserBean user) {
		log.info(user.toString());
		ResMessage res = new ResMessage(true, "操作成功！");
		try {
			userServiceImpl.saveUserBean(user);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error("ResMessage----saveUserBean()",e);
			res.setStatus(false);
			res.setInformation("系统繁忙，请稍后重试！");
		}
		
		return res;
	}
	
	@RequestMapping(value= {"/{id}"},method=RequestMethod.PUT,produces= {"application/json;charset=utf-8"})
	public ResMessage updateUserBean(UserBean user) {
		log.info(user.toString());
		ResMessage res = new ResMessage(true, "操作成功！");
		try {
			userServiceImpl.updateUserBean(user);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error("ResMessage----updateUserBean()",e);
			res.setStatus(false);
			res.setInformation("系统繁忙，请稍后重试！");
		}
		
		return res;
	}
	
	@RequestMapping(value= {"/{id}"},method=RequestMethod.DELETE,produces= {"application/json;charset=utf-8"})
	public ResMessage deleteUserBean(UserBean user) {
		log.info(user.toString());
		ResMessage res = new ResMessage(true, "操作成功！");
		try {
			userServiceImpl.deleteUserBean(user);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error("ResMessage----deleteUserBean()",e);
			res.setStatus(false);
			res.setInformation("系统繁忙，请稍后重试！");
		}
		
		return res;
	}
	
	
	@RequestMapping(value= {"/{id}"},method=RequestMethod.GET,produces= {"application/json;charset=utf-8"})
	public UserBean getUserBeanById(@PathVariable("id")Long id) {
		log.info(id.toString());
		
		UserBean user = null;
		try {
			user = userServiceImpl.getUserBeanById(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error("ResMessage----deleteUserBean()",e);
		}
		
		return user;
	}
}
