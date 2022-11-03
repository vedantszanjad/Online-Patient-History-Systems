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

import com.ysh.ophs.model.Disease;
import com.ysh.ophs.service.DiseaseService;

@RestController
public class DiseaseController {

	@Autowired
	DiseaseService diseaseService;

	@PostMapping("/addDisease")
	public int addDisease(@RequestBody Disease disease) {
		diseaseService.saveOrUpdate(disease);
		return disease.getDiseaseId();
	}

	@GetMapping("getAllDiseaseList")
	public List<Disease> getAllDiseaseList() {
		return diseaseService.getAllDiseaseList();
	}

	@DeleteMapping("/deleteDisease/{diseaseId}")
	public void deleteDiseaseById(@PathVariable("diseaseId") int diseaseId) {
		diseaseService.delete(diseaseId);
	}

	@PutMapping("/updateDisease/{diseaseId}")
	public void updateDisease(@PathVariable("diseaseId") int diseaseId, @RequestBody Disease disease) {
		diseaseService.updateDisease(diseaseId, disease);
	}
}
