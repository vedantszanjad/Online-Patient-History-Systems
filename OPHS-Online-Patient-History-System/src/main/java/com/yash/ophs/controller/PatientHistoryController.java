package com.yash.ophs.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yash.ophs.model.PatientHistory;
import com.yash.ophs.service.PatientHistoryService;

@RestController
@RequestMapping("/patientHistory")
@CrossOrigin(origins = "*")
public class PatientHistoryController 
{
	@Autowired
	private PatientHistoryService phService;
	
	@GetMapping("/getAllPatientHistory")
	public List<PatientHistory>getAllPhHistory () {
	
		List<PatientHistory> list=phService.getPatientHistory();
		list.stream().forEach(p -> System.out.println(p.getPatientDocVisit().getDoctor().getDoctorName()));
		 return list;
	}
	
//	@GetMapping("/getPatientHistoryById/{patientHistoryId}")
//	public Optional<PatientHistory> getPatientHistoryById(@PathVariable int patientHistoryId)
//		{
//		
//		 return phService.getPatientHistoryById(patientHistoryId);
//		}
//	
	
	@GetMapping("/getPatientHistoryById/{patientHistoryId}")
	public PatientHistory getPatientHistoryById(@PathVariable(name="patientHistoryId") int patientHistoryId)
	{
		return phService.findByPatientAllergyHistoryPatientRegistrationPatientId(patientHistoryId);
	}
	
}
