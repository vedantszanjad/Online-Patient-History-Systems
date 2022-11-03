package com.yash.ophs.service;

import java.util.List;

import com.yash.ophs.model.Disease;

public interface DiseaseService {

	public void saveOrUpdate(Disease disease);

	public List<Disease> getAllDiseaseList();

	public void delete(int diseaseId);

	public void updateDisease(int diseaseId, Disease disease);

}
