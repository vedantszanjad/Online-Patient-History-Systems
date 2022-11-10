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
import com.yash.ophs.model.Medicine;
import com.yash.ophs.serviceimplementation.MedicineServiceImplementation;

@RestController
@RequestMapping("/medicine")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MedicineController {

	@Autowired
	private MedicineServiceImplementation medSercImpl;
	
	@GetMapping("/getAllMedicines")
	public List<Medicine> getAllMedicines() {

		return this.medSercImpl.getAllMedicines();
	}

	@PostMapping("/addMedicine")
	public Medicine addMedicine(@RequestBody Medicine medicine) {
		return this.medSercImpl.addMedicine(medicine);

	}

	@PutMapping("/updateMedicine/{tabletId}")
	public Medicine updateMedicine(@RequestBody Medicine medicine, @PathVariable int tabletId) {
		return this.medSercImpl.update(medicine,tabletId);

	}

	@DeleteMapping("/deleteMedicine/{tabletId}")
	public void deleteMedicine(@PathVariable String tabletId) {
		medSercImpl.deleteMedicine(Integer.parseInt(tabletId));
	}
	
	@GetMapping("/getOneMedicine/{tabletId}")
	public Optional<Medicine> getMedicineById(@PathVariable String tabletId) {

		return medSercImpl.getOneMedicine(Integer.parseInt(tabletId));
	}
	
	@GetMapping("/findMedicineById/{tabletId}")
	public Optional<Medicine>  findDoctorById(@PathVariable("tabletId") int tabletId) {

		return this.medSercImpl.findMedicineById(tabletId);
	}

}
