package com.yash.ophs.serviceimplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.ophs.dao.PatientHistoryDao;
import com.yash.ophs.model.PatientHistory;
import com.yash.ophs.service.PatientHistoryService;

@Service
public class PatientHistoryServiceImpl implements PatientHistoryService
{

	@Autowired
	private PatientHistoryDao phDao;
	
	@Override
	public List<PatientHistory> getPatientHistory() {
		
		return this.phDao.findAll();
	}

	@Override
	public PatientHistory getPatientHistoryById(int patientHistoryId) {
		
		return this.phDao.findByPatientAllergyHistoryPatientRegistrationPatientId(patientHistoryId);
	}

	public PatientHistory findByPatientAllergyHistoryPatientRegistrationPatientId(int patientHistoryId)
	{
		return this.phDao.findByPatientAllergyHistoryPatientRegistrationPatientId(patientHistoryId);
	}

}
