package com.yash.ophs.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int roleId;
	String adminRoles;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "role")
	private Set<AdminRole> adminRole = new HashSet<AdminRole>();
	
	public Role()
	{
		
	}

	public Role(int roleId, String adminRoles, Set<AdminRole> adminRole) {
		super();
		this.roleId = roleId;
		this.adminRoles = adminRoles;
		this.adminRole = adminRole;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getAdminRoles() {
		return adminRoles;
	}

	public void setAdminRoles(String adminRoles) {
		this.adminRoles = adminRoles;
	}

	public Set<AdminRole> getAdminRole() {
		return adminRole;
	}

	public void setAdminRole(Set<AdminRole> adminRole) {
		this.adminRole = adminRole;
	}


}
