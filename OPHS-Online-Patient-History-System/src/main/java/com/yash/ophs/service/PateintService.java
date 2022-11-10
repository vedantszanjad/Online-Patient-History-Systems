package com.yash.ophs.service;

import java.util.List;

import com.yash.ophs.model.PatientRegistration;

public interface PateintService {

//	public PatientRegistration saveOrUpdate(PatientRegistration pr);

	public List<PatientRegistration> getAllpatient();

	public void delete(int patientId);

	public void updatePatient(int patientId,PatientRegistration pr);
	
	public PatientRegistration fetchUserByEmailId(String emailId);

	public PatientRegistration saveOrUpdate(PatientRegistration register);
	   
	public PatientRegistration fetchUserByEmailIdAndPassword(String tempEmailId, String tempPassword);
}
