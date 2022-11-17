package com.yash.ophs.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.ophs.dao.PatientHospitalHistoryDao;
import com.yash.ophs.model.PatientHospitalHistory;
import com.yash.ophs.service.PhHistoryService;

@Service
public class PhHistoryServiceImpl implements PhHistoryService {

	@Autowired
	private PatientHospitalHistoryDao ph; 
	
	@Override
	public List<PatientHospitalHistory> getAllPhHistory() {
		// TODO Auto-generated method stub
		return this.ph.findAll();
	}

	
}
