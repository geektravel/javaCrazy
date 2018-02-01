package com.crazybug.login.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crazybug.login.entities.User;
import com.crazybug.login.service.LoginService;

@Controller
@RequestMapping("login")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(method = RequestMethod.GET)
	public String home(ModelMap modelMap) {
		modelMap.put("user", new User());
		return "user/home";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(@ModelAttribute("user") User user, ModelMap modelMap, HttpSession session) {
		
		if (loginService.findByUsernameAndPassword(user.getUsername(), user.getPassword()) != null) {
			
			session.setAttribute("username", user.getUsername());
			return "user/home";
			
		} else {
			
			modelMap.put("error", "User login is Invalid.");
			return "user/login";
			
		}

	}
}
