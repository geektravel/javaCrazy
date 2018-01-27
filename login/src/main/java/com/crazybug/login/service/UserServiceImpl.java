package com.crazybug.login.service;

import com.crazybug.login.dao.UserDao;
import com.crazybug.login.dao.UserDaoImpl;
import com.crazybug.login.model.Login;
import com.crazybug.login.model.User;

public class UserServiceImpl implements UserService {

	public User register(User user) {
		
		UserDao userDao = new UserDaoImpl();
		userDao.register(user);
		
		return user;
	}

	public User validateUser(Login login) {
		User u = new User();
		if(login.getUsername() != null && login.getPassword() != null){
			System.out.println("validated user successfully.");
			
			u.setUsername(login.getUsername());
			u.setPassword(login.getPassword());
			return u;
		}
		return u;
	}

	
}
