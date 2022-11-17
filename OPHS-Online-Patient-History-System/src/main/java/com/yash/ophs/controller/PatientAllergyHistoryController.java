package com.yash.ophs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yash.ophs.model.PatientAllergyHistory;
import com.yash.ophs.serviceimplementation.PatientAllergyHistoryImpl;

@RestController
@RequestMapping("/pallergy")
@CrossOrigin("*")
public class PatientAllergyHistoryController {

	@Autowired
	private PatientAllergyHistoryImpl pahS;
	
	@GetMapping("/getAllPaHistory")
	public List<PatientAllergyHistory>getAllPaHistory () {
	return pahS.getPaHistory();
	}
}
