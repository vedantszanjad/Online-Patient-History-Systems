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

import com.yash.ophs.model.Medicine;
import com.yash.ophs.model.PatientRegistration;
import com.yash.ophs.service.PateintService;

@RestController
@RequestMapping("/patient")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PatientController {

	@Autowired
	private PateintService pateintService;

	
	
	@GetMapping("/getOneUser/{roleId}")
	public Optional<PatientRegistration> getUserById(@PathVariable String roleId) {

		return pateintService.findUserById(Integer.parseInt(roleId));
	}
	
	@PostMapping(value = "/addPatient")
    public PatientRegistration registerUser(@RequestBody PatientRegistration register) throws Exception {
        String emailId = register.getEmailId();
        if (emailId != null && !"".equals(emailId)) {
            PatientRegistration userObj = pateintService.fetchUserByEmailId(emailId);
            if (userObj != null) {
                throw new Exception("User " + emailId + " is already exist");
            }
        }
        return pateintService.saveOrUpdate(register);

   }

   @PostMapping(value = "/loginUser")
    public PatientRegistration loginUser(@RequestBody PatientRegistration user) throws Exception {
        String tempEmailId = user.getEmailId();
        String tempPassword = user.getPassword();

       PatientRegistration userObj = null;

       if (tempEmailId != null && tempPassword != null) {
            userObj = pateintService.fetchUserByEmailIdAndPassword(tempEmailId, tempPassword);
       System.out.println("pid :: "+userObj.getPatientId()); 
       
       }
        if (userObj == null) {
            throw new Exception("Bad Credentials");
        }
        return userObj;
    }

	

	
	@GetMapping("/getAllPatientDetails")
	public List<PatientRegistration> getAllPatientDetails() {
		return pateintService.getAllpatient();
	}

	
	@DeleteMapping("/deletePatient/{patientId}")
	public void deletePatient(@PathVariable("patientId") int patientId) {
		pateintService.delete(patientId);
	}

	
	@PutMapping("/updatePatient/{patientId}")
	public void updatePatient(@PathVariable("patientId") int patientId, @RequestBody PatientRegistration pr) {
		pateintService.updatePatient(patientId, pr);
	}
}
