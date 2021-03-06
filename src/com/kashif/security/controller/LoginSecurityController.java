package com.kashif.security.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Dinesh Rajput
 *
 */
@Controller
public class LoginSecurityController {
	
	 @RequestMapping(value = "/admin", method = RequestMethod.GET)
	 public String welcomeAdmin(ModelMap model, Principal principal) {
	  String username = principal.getName();
	  model.addAttribute("author", username);
	  model.addAttribute("message", "Hello Spring Security - ADMIN PAGE");
	  return "welcome";

	 }
	
	@RequestMapping(value="/index", method = RequestMethod.GET)
	public String executeSecurity(ModelMap model, Principal principal ) {
 
		String name = principal.getName();
		model.addAttribute("author", name);
		model.addAttribute("message", "Welcome To Login Form Based Spring Security Example!!!");
		return "welcome";
 
	}
 
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(ModelMap model) {
 
		return "login";
 
	}
 
	@RequestMapping(value="/fail2login", method = RequestMethod.GET)
	public String loginerror(ModelMap model) {
 
		model.addAttribute("error", "true");
		return "login";
 
	}
 
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(ModelMap model) {
 
		return "login";
 
	}
}
