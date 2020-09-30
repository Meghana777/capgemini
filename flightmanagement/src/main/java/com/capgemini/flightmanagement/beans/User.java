package com.capgemini.flightmanagement.beans;

import java.math.BigInteger;


public class User {
	private  String userType;
    private BigInteger userId;
    private String userName;
    private Password userPassword;
    private BigInteger userPhone;
    private String userEmail;
    
    //Getter and Setter Methods//
    
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public BigInteger getUserId() {
		return userId;
	}
	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Password getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(Password userPassword) {
		this.userPassword = userPassword;
	}
	public BigInteger getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(BigInteger userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	//Generate toString() Method//
	
	@Override
	public String toString() {
		return "User [userType=" + userType + ", userId=" + userId + ", userName=" + userName + ", userPhone="
				+ userPhone + ", userEmail=" + userEmail + "]";
	}
    

}
