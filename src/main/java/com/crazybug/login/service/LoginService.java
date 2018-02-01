package com.crazybug.login.service;

import com.crazybug.login.entities.User;

public interface LoginService {
	
	public User findByUsernameAndPassword(String username, String password);

}
