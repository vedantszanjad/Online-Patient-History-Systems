package com.yash.ophs.controller;

import java.util.List;

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

import com.yash.ophs.model.AdminLogin;
import com.yash.ophs.model.PatientRegistration;
import com.yash.ophs.service.AdminLoginService;
import com.yash.ophs.serviceimplementation.AdminLoginServiceImpl;

@RequestMapping("/admin")
@RestController
@CrossOrigin("*")
public class AdminController {
	@Autowired
	private AdminLoginServiceImpl adminLogin;

	/**
	 * creating post mapping that post the admin detail in the database
	 * 
	 * @param al
	 * @return al.getAdminId()
	 */
//	@PostMapping("/loginAdmin")
//	public int loginAdmins(@RequestBody AdminLogin al) {
//		adminLoginService.saveOrUpdate(al);
//		return al.getAdminId();
//	}

	/**
	 * creating get mapping that get the all admin details from the database
	 * 
	 * @return List<AdminLogin>
	 */
//	@GetMapping("getAllAdminDetails")
//	public List<AdminLogin> getAllAdminDetails() {
//		return adminLoginService.getAllAdminDetails();
//	}

	/**
	 * creating delete mapping that delete the admin detail by Id from the database
	 * 
	 * @param adminId
	 * @return void
	 */
//	@DeleteMapping("/deleteAdmin/{adminId}")
//	public void deleteAdminbyId(@PathVariable("adminId") int adminId) {
//		adminLoginService.delete(adminId);
//	}

	/**
	 * creating update mapping that update the admin details by Id from the database
	 * 
	 * @param adminId
	 * @param al
	 * @return void
	 */
//	@PutMapping("/updateAdmin/{adminId}")
//	public void updatePatient(@PathVariable("adminId") int adminId, @RequestBody AdminLogin al) {
//		adminLoginService.updatePatient(adminId, al);
//	}
	
	  @PostMapping(value = "/loginAdmin")
	    public AdminLogin loginAdmin(@RequestBody AdminLogin admin) throws Exception {
	        String adminName = admin.getAdminName();
	        String userPassword = admin.getUserPassword();

	        AdminLogin userObj = null;

	       if (adminName != null && userPassword != null) {
	            userObj = adminLogin.fetchAdminByadminNameAnduserPassword(adminName, userPassword);
	       System.out.println("pid :: "+userObj.getAdminId()); 
	       
	       }
	        if (userObj == null) {
	            throw new Exception("Bad Credentials");
	        }
	        return userObj;
	    }
}
