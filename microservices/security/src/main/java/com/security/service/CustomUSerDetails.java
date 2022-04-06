package com.security.service;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.security.model.Userinfo;

public class CustomUSerDetails implements UserDetails {
	
	private Userinfo userinfo;
	
	public CustomUSerDetails(Userinfo userinfo) {
		super();
		this.userinfo = userinfo;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return Collections.singleton(new SimpleGrantedAuthority(userinfo.getRole()));
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return userinfo.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userinfo.getUserName();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
	
	

}
