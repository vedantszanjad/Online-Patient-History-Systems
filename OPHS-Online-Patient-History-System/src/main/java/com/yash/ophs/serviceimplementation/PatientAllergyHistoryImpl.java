package com.yash.ophs.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.ophs.dao.PatientAllergyHistoryDao;
import com.yash.ophs.model.PatientAllergyHistory;
import com.yash.ophs.service.PatientAllergyHistoryService;

@Service
public class PatientAllergyHistoryImpl implements PatientAllergyHistoryService
{

	@Autowired
	private PatientAllergyHistoryDao pahd;
	
	@Override
	public List<PatientAllergyHistory> getPaHistory() {
		return pahd.findAll();
	}

}
