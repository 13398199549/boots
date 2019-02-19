package com.gezhi.springboot.configure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
//import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;

/**
 * @Configuration 将该类声明为一个配置类，用来替代applicationContext.xml
 * @ComponentScan 开启容器的自动扫描， 并使用Filter排除一些不必要的组件
 * @author Administrator
 * 
 * 假如写了一些xml的配置文件，还可以使用@ImportResource({"classpath*:XXX.xml"})
 * 导入配置文件的内容
 */


@Configuration
@ComponentScan(basePackages= {"com.gezhi.springboot"},excludeFilters= {
		@ComponentScan.Filter(
				type=FilterType.ANNOTATION,value={Controller.class})})
public class ApplicationContextConfig {

	

	
	
	
	
	
	
	
	
	
}
