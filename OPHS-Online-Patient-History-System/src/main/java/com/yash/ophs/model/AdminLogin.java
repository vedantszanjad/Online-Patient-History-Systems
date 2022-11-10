package com.yash.ophs.model;

import java.util.*;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;

@Entity
public class AdminLogin{ 
//implements UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int adminId;
	String adminName;
	String userPassword;
	String adminRole;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy="adminLogin")
	private Set <AdminRole> admineRole = new HashSet<AdminRole>();

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

	
	
	
	public Set<AdminRole> getAdmineRole() {
		return admineRole;
	}

	public void setAdmineRole(Set<AdminRole> admineRole) {
		this.admineRole = admineRole;
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


//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		// TODO Auto-generated method stub
//		
//		Set<Authority> set = new HashSet<>();
//		this.admineRole.forEach(adminRole -> 
//		{
//			set.add(new Authority(adminRole.getRole().getAdminRoles()));
//		});
//		return set;
//	}
//
//	@Override
//	public String getPassword() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String getUsername() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public boolean isAccountNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isAccountNonLocked() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isEnabled() {
//		// TODO Auto-generated method stub
//		return true;
//	}

	@Override
	public String toString() {
		return "AdminLogin [adminId=" + adminId + ", adminName=" + adminName + ", userPassword=" + userPassword
				+ ", adminRole=" + adminRole + "]";
	}
}
