package com.gezhi.springboot.bean;

import java.io.Serializable;
/**
 * 响应对象1
 * @author Administrator
 *
 */
public class ResMessage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 897282872389896214L;

	private boolean status;
	private Integer code;
	private String information;
	public ResMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResMessage(boolean status, String information) {
		super();
		this.status = status;
		this.information = information;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	@Override
	public String toString() {
		return "ResMessage [status=" + status + ", code=" + code + ", information=" + information + "]";
	}
}
