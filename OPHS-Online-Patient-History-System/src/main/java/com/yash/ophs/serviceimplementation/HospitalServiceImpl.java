package com.ysh.ophs.service_impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ysh.ophs.model.Hospital;
import com.ysh.ophs.repository.HospitalDao;
import com.ysh.ophs.service.HospitalService;

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
}
