package com.yash.ophs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.ophs.model.AdminLogin;
import com.yash.ophs.service.AdminLoginService;

@RequestMapping("/admin")
@RestController
public class AdminController {
	@Autowired
	AdminLoginService adminLoginService;

	/**
	 * creating post mapping that post the admin detail in the database
	 * 
	 * @param al
	 * @return al.getAdminId()
	 */
	@PostMapping("/loginAdmin")
	public int loginAdmin(@RequestBody AdminLogin al) {
		adminLoginService.saveOrUpdate(al);
		return al.getAdminId();
	}

	/**
	 * creating get mapping that get the all admin details from the database
	 * 
	 * @return List<AdminLogin>
	 */
	@GetMapping("getAllAdminDetails")
	public List<AdminLogin> getAllAdminDetails() {
		return adminLoginService.getAllAdminDetails();
	}

	/**
	 * creating delete mapping that delete the admin detail by Id from the database
	 * 
	 * @param adminId
	 * @return void
	 */
	@DeleteMapping("/deleteAdmin/{adminId}")
	public void deleteAdminbyId(@PathVariable("adminId") int adminId) {
		adminLoginService.delete(adminId);
	}

	/**
	 * creating update mapping that update the admin details by Id from the database
	 * 
	 * @param adminId
	 * @param al
	 * @return void
	 */
	@PutMapping("/updateAdmin/{adminId}")
	public void updatePatient(@PathVariable("adminId") int adminId, @RequestBody AdminLogin al) {
		adminLoginService.updatePatient(adminId, al);
	}
}
