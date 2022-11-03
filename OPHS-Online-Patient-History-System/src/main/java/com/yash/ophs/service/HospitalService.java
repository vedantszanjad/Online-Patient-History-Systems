package com.ysh.ophs.service;

import java.util.List;

import com.ysh.ophs.model.Hospital;


public interface HospitalService {

	public void saveOrUpdate(Hospital hospital);

	public List<Hospital> getAllHospitalList();

	public void delete(int hospitalId);

	public void updateHospital(int hospitalId, Hospital hospital);

}
