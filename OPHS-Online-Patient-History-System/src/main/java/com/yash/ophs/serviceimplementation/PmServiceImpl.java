package com.yash.ophs.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.ophs.dao.PatientDiseaseHistoryDao;
import com.yash.ophs.dao.PatientMedicinehistoryDao;
import com.yash.ophs.model.Medicine;
import com.yash.ophs.model.PatientMedicianhistory;
import com.yash.ophs.service.PatientMedicineHistoryService;

@Service
public class PmServiceImpl implements PatientMedicineHistoryService
{
	@Autowired
	private PatientMedicinehistoryDao pm;

	@Override
	public List<PatientMedicianhistory> getAllPatientMedicineHistory() {
		// TODO Auto-generated method stub
		return this.pm.findAll();
	}

}
