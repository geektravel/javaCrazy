package com.crazybug.login.service;

import com.crazybug.login.model.Login;
import com.crazybug.login.model.User;

public interface UserService {
	
	public User register(User user);

	public User validateUser(Login login);

}
