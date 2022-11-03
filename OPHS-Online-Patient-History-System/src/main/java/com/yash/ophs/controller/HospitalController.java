package com.ysh.ophs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ysh.ophs.model.Hospital;
import com.ysh.ophs.service.HospitalService;

@RestController
public class HospitalController {
	@Autowired
	HospitalService hospitalService;
	
	@PostMapping("/addHospital")
	public int addHospital(@RequestBody Hospital hospital) {
		hospitalService.saveOrUpdate(hospital);
		return hospital.getHospitalId();
	}

	
	@GetMapping("getAllHospitalList")
	public List<Hospital> getAllHospitalList() {
		return hospitalService.getAllHospitalList();
	}

	
	@DeleteMapping("/deleteHospital/{hospitalId}")
	public void deleteHospitalById(@PathVariable("hospitalId") int hospitalId) {
		hospitalService.delete(hospitalId);
	}

	
	@PutMapping("/updateHospital/{hospitalId}")
	public void updateHospital(@PathVariable("hospitalId") int hospitalId, @RequestBody Hospital hospital) {
		hospitalService.updateHospital(hospitalId, hospital);
	}
}
