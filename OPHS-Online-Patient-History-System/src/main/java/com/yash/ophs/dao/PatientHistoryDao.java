package com.yash.ophs.dao;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.ophs.model.PatientHistory;

@Repository
public interface PatientHistoryDao extends JpaRepository<PatientHistory, Integer>
{

	public PatientHistory findByPatientAllergyHistoryPatientRegistrationPatientId(int patientHistoryId);

	
}
