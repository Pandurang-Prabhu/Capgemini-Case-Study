package com.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.security.Repo.UserInfoRepo;
import com.security.model.Userinfo;

@Service
public class MyUserDetailsService implements UserDetailsService{
	
	@Autowired
	private UserInfoRepo userInfoRepo;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Userinfo userinfo = userInfoRepo.findByUserName(userName);
		if (userinfo == null) {
			throw new UsernameNotFoundException("User Not Found");
			}
		return new CustomUSerDetails(userinfo);
	}
	
	

}
