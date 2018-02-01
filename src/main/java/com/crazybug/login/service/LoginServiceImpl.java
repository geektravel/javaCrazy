package com.crazybug.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crazybug.login.dao.LoginDao;
import com.crazybug.login.entities.User;

@Service("loginService")
@Transactional
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginDao loginDao;
	
	@Override
	public User findByUsernameAndPassword(String username, String password) {
		return loginDao.findByUsernameAndPassword(username,password);
	}

}
