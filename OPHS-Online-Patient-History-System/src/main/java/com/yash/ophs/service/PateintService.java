package com.yash.ophs.service;

import java.util.List;

import com.yash.ophs.model.PatientRegistration;

public interface PateintService {

	public void saveOrUpdate(PatientRegistration pr);

	public List<PatientRegistration> getAllpatient();

	public void delete(int patientId);

	public void updatePatient(int patientId,PatientRegistration pr);

}
