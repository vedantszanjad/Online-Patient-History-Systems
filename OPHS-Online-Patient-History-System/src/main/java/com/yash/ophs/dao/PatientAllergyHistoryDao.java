package com.yash.ophs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.ophs.model.PatientAllergyHistory;

@Repository
public interface PatientAllergyHistoryDao extends JpaRepository<PatientAllergyHistory , Integer> {

}
