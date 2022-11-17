package com.yash.ophs.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yash.ophs.model.PatientDiseaseHistory;


public interface PatientDiseaseService  {
	public List<PatientDiseaseHistory> getAllPatientDiseaseHistory();
}
