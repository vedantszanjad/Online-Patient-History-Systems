package com.ysh.ophs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ysh.ophs.model.AdminLogin;

@Repository
public interface AdminLoginDao extends JpaRepository<AdminLogin, Integer> {

}
