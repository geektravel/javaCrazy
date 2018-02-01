package com.crazybug.login.dao;

import org.springframework.data.repository.CrudRepository;

import com.crazybug.login.entities.User;

public interface LoginDao extends CrudRepository<User,Integer>{

	public User findByUsernameAndPassword(String username, String password);

}