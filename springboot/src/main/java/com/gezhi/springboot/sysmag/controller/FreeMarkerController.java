package com.gezhi.springboot.sysmag.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gezhi.springboot.bean.CompanyBean;
import com.gezhi.springboot.bean.UserBean;

@RequestMapping("/sysmag")
@Controller
public class FreeMarkerController {

	@Resource
	private CompanyBean companyBean;
	
	@RequestMapping("/freemarker")
	public String toFreemarkerPage(Model model,String userName) {
		
		model.addAttribute("userName", userName);
		model.addAttribute("companyBean", companyBean);
		
		System.out.println(companyBean);
		
		List<UserBean> users = new ArrayList<>();
		UserBean user01 = new UserBean("张大麻子");
		UserBean user02 = new UserBean("李四");
		UserBean user03 = new UserBean("王五");
		users.add(user01);
		users.add(user02);
		users.add(user03);
		
		model.addAttribute("users", users);
		
		return "freemarker";
		
	}
	
}
