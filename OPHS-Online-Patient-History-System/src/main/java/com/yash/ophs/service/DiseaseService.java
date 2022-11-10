package com.yash.ophs.service;

import java.util.List;
import java.util.Optional;

import com.yash.ophs.model.Disease;
import com.yash.ophs.model.Doctor;

public interface DiseaseService {

	public void saveOrUpdate(Disease disease);

	public List<Disease> getAllDiseaseList();

	public void delete(int diseaseId);

	public void updateDisease(int diseaseId, Disease disease);

	public Optional<Disease> findDiseaseById(int diseaseId);

}
