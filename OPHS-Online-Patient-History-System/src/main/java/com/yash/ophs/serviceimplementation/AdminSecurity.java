//package com.yash.ophs.serviceimplementation;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.yash.ophs.dao.AdminLoginDao;
//import com.yash.ophs.model.AdminLogin;
//
//@Service
//public class AdminSecurity implements UserDetailsService {
//
//	@Autowired
//	private AdminLoginDao adminLoginDao;
//	
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		// TODO Auto-generated method stub
//		AdminLogin adminLogin = this.adminLoginDao.findByAdminName(username);
//		if(adminLogin == null)
//		{
//			System.out.println("User Not Found!!");
//			throw new UsernameNotFoundException("No User Found");
//		}
//		
//		return adminLogin;
//	}
//	
//
//}
