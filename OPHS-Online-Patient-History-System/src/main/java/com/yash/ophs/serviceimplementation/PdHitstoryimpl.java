package com.yash.ophs.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.ophs.dao.PatientDiseaseHistoryDao;
import com.yash.ophs.model.PatientDiseaseHistory;
import com.yash.ophs.service.PatientDiseaseService;

@Service
public class PdHitstoryimpl implements PatientDiseaseService {

	@Autowired
	private PatientDiseaseHistoryDao patientDiseaseHistoryDao;
	
	@Override
	public List<PatientDiseaseHistory> getAllPatientDiseaseHistory() {
		
	return patientDiseaseHistoryDao.findAll();	
	}

}
