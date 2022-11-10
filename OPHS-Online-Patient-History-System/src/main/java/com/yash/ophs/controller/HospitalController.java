package com.yash.ophs.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yash.ophs.model.Hospital;
import com.yash.ophs.service.HospitalService;

@RestController
@RequestMapping("/hospital")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class HospitalController {
	@Autowired
	HospitalService hospitalService;
	
	@PostMapping("/addHospital")
	public int addHospital(@RequestBody Hospital hospital) {
		hospitalService.saveOrUpdate(hospital);
		return hospital.getHospitalId();
	}

	
	@GetMapping("/getAllHospitalList")
	public List<Hospital> getAllHospitalList() {
		return hospitalService.getAllHospitalList();
	}

	
	@DeleteMapping("/deleteHospital/{hospitalId}")
	public String deleteHospitalById(@PathVariable("hospitalId") int hospitalId) {
		hospitalService.delete(hospitalId);
		return "Ok";
	}

	
	@PutMapping("/updateHospital/{hospitalId}")
	public void updateHospital(@PathVariable("hospitalId") int hospitalId, @RequestBody Hospital hospital) {
		hospitalService.updateHospital(hospitalId, hospital);
	}
	
	@GetMapping("/findHospitalById/{hospitalId}")
	public Optional<Hospital>  findHospitalById(@PathVariable("hospitalId") int hospitalId) {

		return this.hospitalService.findHospitalById(hospitalId);
	}
}
