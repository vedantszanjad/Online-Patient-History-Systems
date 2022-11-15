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

import com.yash.ophs.model.Allergy;
import com.yash.ophs.service.AllergyService;

@RestController
@RequestMapping("/allergy")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AllergyController {
	@Autowired
	private AllergyService allergyService;

	@PostMapping("/addAllergy")
	public int addAllergy(@RequestBody Allergy allergy) {
		allergyService.saveOrUpdate(allergy);
		return allergy.getaId();
	}

	@GetMapping("/getAllAllergyList")
	public List<Allergy> getAllAllergyList() {
		return allergyService.getAllAllergyList();
	}

	@DeleteMapping("/deleteAllergy/{aId}")
	public void deleteAllergyById(@PathVariable( value ="aId") int aId) {
		System.out.println("Aid:: "+aId);
		allergyService.delete(aId);
//		return //"Allergy is deleted ";
	}

	@PutMapping("/updateAllergy/{aId}")
	public void updateAllergy(@PathVariable("aId") int aId, @RequestBody Allergy allergy) {
		allergyService.updateAllergy(aId, allergy);
	}
	
	@GetMapping("/findAllergyById/{diseaseId}")
    public Optional<Allergy> findAllergyById(@PathVariable( value="diseaseId") int aId) {



       return this.allergyService.findAllergyById(aId);
    }
}
