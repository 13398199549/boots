package com.gezhi.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import com.gezhi.springboot.configure.ApplicationContextConfig;

@SpringBootApplication
@ServletComponentScan
public class SpringbootApplication {

	public static void main(String[] args) {
		//将ApplicationContextConfig配置类的配置信息，交给spring容器
		SpringApplication.run(ApplicationContextConfig.class, args);
	}

}

