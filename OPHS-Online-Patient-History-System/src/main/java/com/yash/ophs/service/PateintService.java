package com.yash.ophs.service;

import java.util.List;
import java.util.Optional;

import com.yash.ophs.model.Doctor;
import com.yash.ophs.model.Medicine;
import com.yash.ophs.model.PatientRegistration;

public interface PateintService {

//	public PatientRegistration saveOrUpdate(PatientRegistration pr);

	public List<PatientRegistration> getAllpatient();
	
	public void delete(int patientId);

	public void updatePatient(int patientId,PatientRegistration pr);
	
	public PatientRegistration fetchUserByEmailId(String emailId);

	public PatientRegistration saveOrUpdate(PatientRegistration register);
	 
	public Optional<PatientRegistration> findUserById(int roleId);
	
	public PatientRegistration fetchUserByEmailIdAndPassword(String tempEmailId, String tempPassword);
}
