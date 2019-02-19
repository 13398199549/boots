package com.gezhi.springboot.sysmag.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gezhi.springboot.bean.UserBean;
import com.gezhi.springboot.sysmag.service.ILoginService;

@RequestMapping("/sysmag")
@Controller
public class LoginController {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Resource
	private ILoginService loginServiceImpl;
	
	
	@RequestMapping("/login")
	public String login(UserBean user,Model model,HttpServletRequest req) {
		
		log.info(user.toString());
		UserBean res = loginServiceImpl.login(user);
		if(res != null) {
			model.addAttribute("user", res);
		}
		return "main";
	}
	
	
	
	
	
	
	
}
