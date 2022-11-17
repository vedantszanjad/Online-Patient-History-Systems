package com.yash.ophs.service;

import java.util.List;

import com.yash.ophs.model.PatientDocVisit;

public interface PatientDoctorService 
{
	public List<PatientDocVisit> getPdHistory();
}
