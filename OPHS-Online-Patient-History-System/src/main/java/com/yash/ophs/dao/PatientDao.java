package com.yash.ophs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.ophs.model.PatientRegistration;

@Repository
public interface PatientDao extends JpaRepository<PatientRegistration, Integer> {
	
}
