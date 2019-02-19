package com.gezhi.springboot.bean;

import java.io.Serializable;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
/**
 * 公司类
 * @author Administrator
 *
 */
@Component
@ConfigurationProperties(prefix="gezhi")
@PropertySource(value= {"classpath:company.properties"})
public class CompanyBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4349552945449301902L;
	/**
	 * 公司名称
	 */
	private String companyName;
	/**
	 * 联系方式
	 */
	private String telphone;
	/**
	 * 法人代表
	 */
	private String lawPerson;
	
	
	
	public CompanyBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getTelphone() {
		return telphone;
	}
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	public String getLawPerson() {
		return lawPerson;
	}
	public void setLawPerson(String lawPerson) {
		this.lawPerson = lawPerson;
	}
	@Override
	public String toString() {
		return "CompanyBean [companyName=" + companyName + ", telphone=" + telphone + ", lawPerson=" + lawPerson + "]";
	}
}
