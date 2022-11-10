package com.yash.ophs.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AdminRole {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int adminRoleId;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private AdminLogin adminLogin;
	
	@ManyToOne
	private Role role;
	
	public AdminRole()
	{
		
	}

	public AdminRole(int adminRoleId, AdminLogin adminLogin, Role role) {
		super();
		this.adminRoleId = adminRoleId;
		this.adminLogin = adminLogin;
		this.role = role;
	}

	public int getAdminRoleId() {
		return adminRoleId;
	}

	public void setAdminRoleId(int adminRoleId) {
		this.adminRoleId = adminRoleId;
	}

	public AdminLogin getAdminLogin() {
		return adminLogin;
	}

	public void setAdminLogin(AdminLogin adminLogin) {
		this.adminLogin = adminLogin;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	
}
