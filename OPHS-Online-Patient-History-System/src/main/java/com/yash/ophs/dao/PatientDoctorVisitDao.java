package com.yash.ophs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.ophs.model.PatientDocVisit;

@Repository
public interface PatientDoctorVisitDao extends JpaRepository<PatientDocVisit, Integer> {

}
