package com.yash.ophs.serviceimplementation;

import java.util.List;

import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yash.ophs.dao.AdminLoginDao;
import com.yash.ophs.model.AdminLogin;
import com.yash.ophs.service.AdminLoginService;

@Service
public class AdminLoginServiceImpl implements AdminLoginService {
	@Autowired
	AdminLoginDao adminLoginDao;

	public AdminLogin fetchAdminByadminNameAnduserPassword(String adminName, String userPassword) {
		// TODO Auto-generated method stub
		 return adminLoginDao.findByAdminNameAndUserPassword(adminName,userPassword);
	}

//	@Override
//	public void saveOrUpdate(AdminLogin al) {
//
//		adminLoginDao.save(al);
//
//	}
//
//	@Override
//	public List<AdminLogin> getAllAdminDetails() {
//
//		return adminLoginDao.findAll();
//	}
//
//	@Override
//	public void delete(int adminId) {
//
//		adminLoginDao.deleteById(adminId);
//	}
//
//	@Override
//	public void updatePatient(int adminId, AdminLogin al) {
//
//		Optional<AdminLogin> op = adminLoginDao.findById(adminId);
//		if (op.isPresent()) {
//			AdminLogin adminLogin = op.get();
//			adminLogin.setAdminId(adminId);
//			adminLogin.setAdminName(al.getAdminName());
//			adminLogin.setAdminRole(al.getAdminRole());
//			adminLogin.setUserPassword(al.getUserPassword());
//
//			adminLoginDao.save(al);
//			System.out.println("Admin updated successfully ...!!!");
//		} else {
//			System.out.println("Admin id not found ...!!!");
//		}
//
//	}

//	@Override
//	public AdminLogin fetchAdminByEmailIdAndPassword(String adminName, String userPassword) {
//	
//		return adminLoginDao.findByEmailIdAndPassword(adminName,userPassword);
//	}

}
