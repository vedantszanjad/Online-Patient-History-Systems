package com.ysh.ophs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AdminLogin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int adminId;
	String adminName;
	String userPassword;
	String adminRole;

	public AdminLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminLogin(int adminId, String adminName, String userPassword, String adminRole) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.userPassword = userPassword;
		this.adminRole = adminRole;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getAdminRole() {
		return adminRole;
	}

	public void setAdminRole(String adminRole) {
		this.adminRole = adminRole;
	}

	@Override
	public String toString() {
		return "AdminLogin [adminId=" + adminId + ", adminName=" + adminName + ", userPassword=" + userPassword
				+ ", adminRole=" + adminRole + "]";
	}

}
