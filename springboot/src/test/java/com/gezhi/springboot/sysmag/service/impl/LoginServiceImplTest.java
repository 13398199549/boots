package com.gezhi.springboot.sysmag.service.impl;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.gezhi.springboot.bean.UserBean;
import com.gezhi.springboot.configure.ApplicationContextConfig;
/**
 * @WebAppConfiguration 表示这是一个WEB项目
 * @author Administrator
 *
 */
import com.gezhi.springboot.sysmag.service.ILoginService;
@RunWith(SpringRunner.class)
@SpringBootTest(classes= {ApplicationContextConfig.class})
@WebAppConfiguration
public class LoginServiceImplTest {

	@Resource
	private ILoginService loginServiceImpl;
	
	@Test
	public void login() {
		UserBean user = new UserBean();
		user.setLoginName("zmy");
		user.setPassword("123456");
		UserBean res = loginServiceImpl.login(user);
		Assert.assertNotNull(res);
		
		System.out.println(res);
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
