package com.yash.ophs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yash.ophs.model.PatientHospitalHistory;
import com.yash.ophs.service.PhHistoryService;

@RestController
@RequestMapping("/ph")
@CrossOrigin("*")
public class PatientHospitalHistoryController 
{
	@Autowired
	private PhHistoryService ph;
	
	@GetMapping("/getAllPhHistory")
	public List<PatientHospitalHistory>getAllPhHistory () {
	return ph.getAllPhHistory();
	}
}
