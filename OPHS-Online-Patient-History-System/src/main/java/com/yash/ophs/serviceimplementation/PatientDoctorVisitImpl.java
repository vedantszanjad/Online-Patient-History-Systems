package com.yash.ophs.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.ophs.dao.PatientDoctorVisitDao;
import com.yash.ophs.model.PatientDocVisit;
import com.yash.ophs.service.PatientDoctorService;

@Service
public class PatientDoctorVisitImpl implements PatientDoctorService
{
	@Autowired
	private PatientDoctorVisitDao pdVisitDao;
	
	@Override
	public List<PatientDocVisit> getPdHistory() {
		
		return pdVisitDao.findAll();
	}

}
