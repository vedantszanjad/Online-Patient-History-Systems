//package com.yash.ophs.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.DisabledException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.yash.ophs.configuration.JwtUtil;
//import com.yash.ophs.model.JwtRequest;
//import com.yash.ophs.model.JwtResponse;
//import com.yash.ophs.serviceimplementation.AdminSecurity;
//
//@RestController
//@CrossOrigin(origins = "*",allowedHeaders = "*")
//public class AuthenticationController {
//
//	@Autowired
//	private AuthenticationManager authenticationManager;
//	
//	@Autowired
//	private AdminSecurity adminSecurity;
//	
//	@Autowired
//	private JwtUtil jwtUtil;
//	
//	@PostMapping("/generate-token")
//	public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtRequest) {
//		try
//		{
//			authenticate(jwtRequest.getAdminName(), jwtRequest.getUserPassword());
//		}
//		catch(Exception e)
//		{
//			System.out.println("User Not Found " + e.getMessage());
//		}
//		
//		///Authenticate
//		
//		UserDetails userDetails = this.adminSecurity.loadUserByUsername(jwtRequest.getAdminName());
//		String token = this.jwtUtil.generateToken(userDetails);
//		return ResponseEntity.ok(new JwtResponse(token));
//	}
//	
//	 void authenticate(String userName,String password) throws Exception
//	{
//		try
//		{
//			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userName, password));
//		}
//		
//		catch(DisabledException e)
//		{
//			throw new Exception("User Disable " + e.getMessage());
//		}
//		catch(BadCredentialsException a)
//		{
//			throw new Exception("Invalid Credentials " + a.getMessage());
//		}
//	}
//}
