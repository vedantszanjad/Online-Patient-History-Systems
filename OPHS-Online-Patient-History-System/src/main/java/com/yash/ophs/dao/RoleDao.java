package com.yash.ophs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.ophs.model.Role;


@Repository
public interface RoleDao extends JpaRepository<Role,Integer> {

}
