package com.controller;


import jakarta.validation.Valid;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.JwtUtility;
import com.request.LoginRequest;
import com.response.JSONResponse;



@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/app")
public class AuthController {
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@Autowired
	JwtUtility jwtUtil;
	
	@PostMapping("/signin")
	public ResponseEntity<?> validateUser(@Valid @RequestBody LoginRequest loginRequest) {
		
		Authentication authentication= authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword())
				);
		
		SecurityContextHolder.getContext().setAuthentication(authentication);
		UserDetails userdetails= (UserDetails) authentication.getPrincipal();
		
		String token=jwtUtil.generateToken(authentication);
		
		Collection<? extends GrantedAuthority> authorities= userdetails.getAuthorities();
		List<String> list= authorities.stream().map(t -> t.getAuthority()).collect(Collectors.toList());
				
		JSONResponse resp=new JSONResponse(token, userdetails.getUsername(), list) ;
		
		return ResponseEntity.ok(resp);
						
												
	}
	
	

}
