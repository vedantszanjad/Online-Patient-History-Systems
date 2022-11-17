package com.yash.ophs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.ophs.model.PatientMedicianhistory;
import com.yash.ophs.model.PatientRegistration;
import com.yash.ophs.service.PatientMedicineHistoryService;

@RestController
@RequestMapping("/pm")
@CrossOrigin("*")
public class PatientMedicineHistoryController {

	@Autowired
	private PatientMedicineHistoryService pmService;
	
	@GetMapping("/getAllPatientMedicineHistory")
	public List<PatientMedicianhistory> getAllPatientMedicineHistory() {
		return pmService.getAllPatientMedicineHistory();
	}
}
