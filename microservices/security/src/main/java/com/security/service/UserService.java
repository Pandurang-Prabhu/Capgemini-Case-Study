package com.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.security.Repo.UserInfoRepo;
import com.security.model.Userinfo;

@Service
public class UserService {
	
	@Autowired
	private UserInfoRepo userInfoRepo;
	
	
 	PasswordEncoder passwordEncoder;


	public UserService(UserInfoRepo userInfoRepo) {
		
		this.userInfoRepo = userInfoRepo;
		this.passwordEncoder = new BCryptPasswordEncoder();
	}
	
	public Userinfo save(Userinfo userinfo) {
	String encodedPassword = this.passwordEncoder.encode(userinfo.getPassword());
	userinfo.setPassword(encodedPassword);
	return this.userInfoRepo.save(userinfo);
	}
	
	

}
