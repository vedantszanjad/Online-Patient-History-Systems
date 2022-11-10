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

import com.yash.ophs.model.Doctor;
import com.yash.ophs.service.DoctorService;
 


@RestController
@RequestMapping("/doctor")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DoctorController {

	@Autowired
	private DoctorService drSerImpl;

	@GetMapping("/getAllDoctor")
	public List<Doctor> getAllDoctors() {

		return this.drSerImpl.getAllDoctors();
	}
	
	@GetMapping("/findDoctorById/{doctorId}")
	public Optional<Doctor>  findDoctorById(@PathVariable("doctorId") int doctorId) {

		return this.drSerImpl.findDoctorById(doctorId);
	}

	@GetMapping("/getOneDoctor/{doctorId}")
	public Optional<Doctor> getDoctorById(@PathVariable String doctorId) {

		return drSerImpl.getOneDoctor(Integer.parseInt(doctorId));
	}

	@PostMapping("/addDoctor")
	public Doctor addDoctor(@RequestBody Doctor doctor) {
		return this.drSerImpl.addDoctor(doctor);

	}

	@PutMapping("/updateDoctor/{doctorId}")
	public Doctor update(@RequestBody Doctor doctor, @PathVariable int doctorId) {
		return this.drSerImpl.update(doctor,doctorId);

	}

	@DeleteMapping("/deleteDoctor/{doctorId}")
	public String deleteDoctor(@PathVariable("doctorId") int doctorId) {
		drSerImpl.deleteDoctor(doctorId);
		return "ok";
	}
}
