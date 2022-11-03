package com.yash.ophs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.ophs.model.AdminLogin;

@Repository
public interface AdminLoginDao extends JpaRepository<AdminLogin, Integer> {

}
