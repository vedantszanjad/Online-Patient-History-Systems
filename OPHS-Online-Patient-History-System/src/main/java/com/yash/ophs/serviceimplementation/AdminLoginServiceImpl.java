package com.ysh.ophs.service_impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysh.ophs.model.AdminLogin;
import com.ysh.ophs.repository.AdminLoginDao;
import com.ysh.ophs.service.AdminLoginService;

@Service
public class AdminLoginServiceImpl implements AdminLoginService {
	@Autowired
	AdminLoginDao adminLoginDao;

	@Override
	public void saveOrUpdate(AdminLogin al) {

		adminLoginDao.save(al);

	}

	@Override
	public List<AdminLogin> getAllAdminDetails() {

		return adminLoginDao.findAll();
	}

	@Override
	public void delete(int adminId) {

		adminLoginDao.deleteById(adminId);
	}

	@Override
	public void updatePatient(int adminId, AdminLogin al) {

		Optional<AdminLogin> op = adminLoginDao.findById(adminId);
		if (op.isPresent()) {
			AdminLogin adminLogin = op.get();
			adminLogin.setAdminId(adminId);
			adminLogin.setAdminName(al.getAdminName());
			adminLogin.setAdminRole(al.getAdminRole());
			adminLogin.setUserPassword(al.getUserPassword());

			adminLoginDao.save(al);
			System.out.println("Admin updated successfully ...!!!");
		} else {
			System.out.println("Admin id not found ...!!!");
		}

	}

}
