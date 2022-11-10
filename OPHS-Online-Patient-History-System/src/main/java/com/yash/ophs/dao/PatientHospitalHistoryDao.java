package com.yash.ophs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.ophs.model.PatientHospitalHistory;

@Repository
public interface PatientHospitalHistoryDao extends JpaRepository<PatientHospitalHistory, Integer> {

}
