package com.gezhi.springboot.bean;

import java.io.Serializable;

public class UserBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5112202781379931006L;

	private Long id;
	private String loginName;
	private String userName;
	private String password;
	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserBean(String userName) {
		super();
		this.userName = userName;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserBean [id=" + id + ", loginName=" + loginName + ", userName=" + userName + ", password=" + password
				+ "]";
	}
}
