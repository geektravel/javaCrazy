package com.crazybug.login.dao;

import com.crazybug.login.model.Login;
import com.crazybug.login.model.User;

public interface UserDao {

	void register(User user);

	User validateUser(Login login);

}