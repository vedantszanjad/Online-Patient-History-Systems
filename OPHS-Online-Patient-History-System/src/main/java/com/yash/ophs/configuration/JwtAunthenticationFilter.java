//package com.yash.ophs.configuration;
//
//import java.io.IOException;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import com.yash.ophs.serviceimplementation.AdminSecurity;
//
//import io.jsonwebtoken.JwtException;
//
//@Component
//public class JwtAunthenticationFilter extends OncePerRequestFilter {
//
//	
//	@Autowired
//	private AdminSecurity adminSecurity;
//	
//	@Autowired
//	private JwtUtil jwtUtil;
//	
//	@Override
//	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//			throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		final String requestTokenHeader = request.getHeader("Authorization");
//		System.out.println(requestTokenHeader);
//		String userName = null;
//		String jwtToken = null;
//		if(requestTokenHeader != null && requestTokenHeader.startsWith("Bearer")) 
//		{
//			jwtToken = requestTokenHeader.substring(7);
//			try
//			{
//				userName = this.jwtUtil.extractUsername(jwtToken);
//			}
//			catch(JwtException jwt)
//			{
//				System.out.println("Token Expired " + jwt.getStackTrace());
//			}
//			catch(Exception e)
//			{
//				System.out.println(e.getStackTrace());
//			}
//		}
//		else
//		{
//			System.out.println("Invalid Token ,not Start with Bearer String");
//		}
//		
//		//Validate
//		if(userName!=null && SecurityContextHolder.getContext().getAuthentication() == null)
//		{
//		final UserDetails userDetails = this.adminSecurity.loadUserByUsername(userName);
//		if(this.jwtUtil.validateToken(jwtToken, userDetails))
//		{
//			//Token Is Valid
//			
//			UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities()); 
//			usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//			SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
//		}
//		}
//		else {
//			System.out.println("Token Is Not Valid");
//		}
//		filterChain.doFilter(request, response);
//	}
//
//}
