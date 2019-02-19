package com.gezhi.springboot.configure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * SpringMVCConfig 配置类，用来替代springmvc-servlet.xml
 * @author Administrator
 * 
 * @EnableWebMvc 将该类定义为一个WEB层的配置类，需要extends WebMvcConfigurationSupport
 * 取代springboot框架针对WEBMVC的默认配置
 * 
 * 
 * WebMvcConfigurerAdapter 可以替代 @EnableWebMvc + WebMvcConfigurationSupport
 * 并且还支持我们自定义一些配置
 * 
 */
@Configuration
@ComponentScan(basePackages= {"com.gezhi.springboot"},excludeFilters= {
		@ComponentScan.Filter(
				type=FilterType.ANNOTATION,value={Service.class,Repository.class})})

public class SpringMVCConfig extends WebMvcConfigurerAdapter{
	
	
	/**
	 * 注册url -- 页面之间的跳转关系
	 * 比较适合于：从登陆页面上，跳转到"忘记密码","如无账号，请注册"
	 * 从注册页面上，跳转到"已有账号，马上登录"
	 */
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		// TODO Auto-generated method stub
		//配置系统首页http://ip:port/项目名/
		registry.addViewController("/").setViewName("index");
		
//		registry.addViewController("/toLogin").setViewName("index");
	}
	
	/**
	 * 指定静态资源文件目录
	 * 
	 * 还可以在application.properties使用
	 * spring.mvc.static-path-pattern=/static/**
	 * spring.resources.static-locations=classpath:/static/
	 * 
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		registry.addResourceHandler(new String[]{"/static/**","/resource/**"}).addResourceLocations("classpath:/static/");
	}
	
	
	
	
	
	
	
}
