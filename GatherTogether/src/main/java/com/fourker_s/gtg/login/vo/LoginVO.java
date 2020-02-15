package com.fourker_s.gtg.login.vo;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class LoginVO {
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginVO.class);
	 
	private String userId;
	private String password;
	private String userName;
	private String eMail;
	private String phoneNum;
	private String introduce;
	private int	isAdmin;
	
	public int getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	@Override
	public String toString() {
		return "LoginVO [userId=" + userId + ", password=" + password + ", userName=" + userName + ", eMail=" + eMail
				+ ", phoneNum=" + phoneNum + ", introduce=" + introduce + ", isAdmin=" + isAdmin + "]";
	}

	
}
