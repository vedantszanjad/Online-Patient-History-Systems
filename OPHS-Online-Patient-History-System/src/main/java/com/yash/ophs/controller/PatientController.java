package com.yash.ophs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.ophs.model.PatientRegistration;
import com.yash.ophs.service.PateintService;

@RestController
public class PatientController {

	@Autowired
	PateintService pateintService;

	/**
	 * creating post mapping that post the patient detail in the database
	 * 
	 * @param pr
	 * @return int
	 */
	@PostMapping("/addPatient")
	public int addPatient(@RequestBody PatientRegistration pr) {
		pateintService.saveOrUpdate(pr);
		return pr.getPatientId();
	}

	/**
	 * creating get mapping that get the details from the database
	 * 
	 * @return List of PatientRegistration
	 */
	@GetMapping("/getAllPatientDetails")
	public List<PatientRegistration> getAllPatientDetails() {
		return pateintService.getAllpatient();
	}

	/**
	 * creating delete mapping that delete the patient details from the database
	 * 
	 * @param patientId
	 * @return void
	 */
	@DeleteMapping("/patient/{patientId}")
	public void deletePatient(@PathVariable("patientId") int patientId) {
		pateintService.delete(patientId);
	}

	/**
	 * creating update mapping that update the patient details from the database
	 * 
	 * @param pr
	 * @return
	 */
	@PutMapping("/updatePatient/{patientId}")
	public void updatePatient(@PathVariable("patientId") int patientId,@RequestBody PatientRegistration pr) {
		pateintService.updatePatient(patientId,pr);
	}
}
