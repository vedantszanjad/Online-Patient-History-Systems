package com.yash.ophs.service;
import java.util.List;
import java.util.Optional;
import com.yash.ophs.model.PatientHistory;

public interface PatientHistoryService 
{
	public List<PatientHistory> getPatientHistory();

	public PatientHistory getPatientHistoryById(int patientHistoryId);
	
	public PatientHistory findByPatientAllergyHistoryPatientRegistrationPatientId(int patientHistoryId);
}

