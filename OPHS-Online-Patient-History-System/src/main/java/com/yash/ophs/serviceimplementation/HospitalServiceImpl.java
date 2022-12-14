package com.yash.ophs.serviceimplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.ophs.dao.HospitalDao;
import com.yash.ophs.model.Hospital;
import com.yash.ophs.service.HospitalService;

@Service
public class HospitalServiceImpl implements HospitalService {
	@Autowired
	HospitalDao hospitalDao;

	@Override
	public void saveOrUpdate(Hospital hospital) {
		hospitalDao.save(hospital);

	}

	@Override
	public List<Hospital> getAllHospitalList() {

		return hospitalDao.findAll();
	}

	@Override
	public void delete(int hospitalId) {
		hospitalDao.deleteById(hospitalId);

	}

	@Override
	public void updateHospital(int hospitalId, Hospital hospital) {
		Optional<Hospital> op = hospitalDao.findById(hospitalId);
		if (op.isPresent()) {
			Hospital hospital1 = op.get();
			hospital1.setHospitalId(hospitalId);
			hospital1.setHospitalAddress(hospital.getHospitalAddress());
			hospital1.setHospitalCharges(hospital.getHospitalCharges());
			hospital1.setHospitalCreatedDate(hospital.getHospitalCreatedDate());
			hospital1.setHospitalName(hospital.getHospitalName());

			hospitalDao.save(hospital1);
			System.out.println("Hospital updated successfully ...!!!");
		} else {
			System.out.println("Hospital id not found ...!!!");
		}
	}

	@Override
	public Optional<Hospital> findHospitalById(int hospitalId) {
		// TODO Auto-generated method stub
		return hospitalDao.findById(hospitalId);
	}
}
