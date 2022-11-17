package com.yash.ophs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.ophs.model.PatientDiseaseHistory;
import com.yash.ophs.serviceimplementation.PdHitstoryimpl;

@RestController
@RequestMapping("/pd")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PdController {

	@Autowired
	private PdHitstoryimpl pdHitstoryimpl;

	@GetMapping("/getAllHistory")
	public List<PatientDiseaseHistory> getAllMedicines() {
//		return null;
		return this.pdHitstoryimpl.getAllPatientDiseaseHistory();
	}
}
