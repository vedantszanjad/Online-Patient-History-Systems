package com.ysh.ophs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ysh.ophs.model.PatientRegistration;

@Repository
public interface PatientDao extends JpaRepository<PatientRegistration, Integer> {
	
}
