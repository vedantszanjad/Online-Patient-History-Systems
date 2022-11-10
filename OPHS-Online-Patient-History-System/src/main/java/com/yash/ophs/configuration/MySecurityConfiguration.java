//package com.yash.ophs.configuration;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.web.client.HttpClientErrorException.Unauthorized;
//
//import com.yash.ophs.serviceimplementation.AdminSecurity;
//
//@EnableWebSecurity
//@Configuration
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class MySecurityConfiguration extends WebSecurityConfigurerAdapter {
//	
//	@Autowired
//	private JwtAuthenticationEntryPoint unauthorizedHandler;
//	
//	@Autowired
//	private JwtAunthenticationFilter jwtAunthenticationFilter;
//	
//	@Autowired
//	private AdminSecurity adminSecurity;
//	
//	@Bean
//	@Override
//	public AuthenticationManager authenticationManagerBean() throws Exception {
//		// TODO Auto-generated method stub
//		return super.authenticationManagerBean();
//	}
//	
//	@Bean
//	public	PasswordEncoder bCryptPasswordEncoder()
//	{
//		//return new BCryptPasswordEncoder();
//		return NoOpPasswordEncoder.getInstance();
//	}
//	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		// TODO Auto-generated method stub
//		auth.userDetailsService(this.adminSecurity).passwordEncoder(bCryptPasswordEncoder());
//	}
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		// TODO Auto-generated method stub
//		http 
//				.csrf()
//				.disable()
//				.cors()
//				.disable()
//				.authorizeRequests()
//				.antMatchers("generate-token","/admin/").permitAll()
//				.antMatchers(HttpMethod.OPTIONS).permitAll()
//				.anyRequest().authenticated()
//				.and()
//				.exceptionHandling().authenticationEntryPoint(unauthorizedHandler)
//				.and()
//				.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//		
//		http.addFilterBefore(jwtAunthenticationFilter, UsernamePasswordAuthenticationFilter.class);
//		
//		
//	}
//}
