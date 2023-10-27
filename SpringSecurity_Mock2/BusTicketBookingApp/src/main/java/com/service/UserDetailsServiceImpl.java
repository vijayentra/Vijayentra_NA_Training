package com.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.model.Login;
import com.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	UserRepository repo;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Login o=repo.findByUsername(username);
		
		if(o==null) {
			throw new UsernameNotFoundException("User Not Found with username: " + "username");
		}
		return UserDetailsImpl.getUser(o);
	}

}
