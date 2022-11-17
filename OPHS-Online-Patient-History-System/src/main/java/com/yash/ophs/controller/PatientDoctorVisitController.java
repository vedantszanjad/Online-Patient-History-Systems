package com.yash.ophs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.ophs.model.PatientDocVisit;
import com.yash.ophs.model.PatientHistory;
import com.yash.ophs.service.PatientDoctorService;
import com.yash.ophs.service.PatientHistoryService;

@RestController
@RequestMapping("/patientDoctorVisit")
@CrossOrigin("*")
public class PatientDoctorVisitController {
	@Autowired
	private PatientDoctorService pdService;
	
	@GetMapping("/getAllpatientDoctorVisit")
	public List<PatientDocVisit>getAllPhHistory () {
		
	return pdService.getPdHistory();
	}
}
